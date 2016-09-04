package chapter06;

public class LazySingleton {
	private volatile static LazySingleton Instance;

	private LazySingleton() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * 解决方案3： 针对重要代码进行单独同步，然并卵
	  public static LazySingleton getInstance() {
		try {

			if (Instance != null) {

			} else {
				Thread.sleep(3000);
				//然并卵，两个不同的线程，仍然会让代码跑到这里，当第一个线程释放锁后，Instance=new LazySingleton()
				//会再次执行，就出现两个实例对象
				synchronized (LazySingleton.class) {
					Instance = new LazySingleton();
				}
			}
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		return Instance;
	}
	解决方案4：使用DCL双检查锁机制(双重检查Double-Check Locking)
	大多数多线程结合单例使用的解决方案
	 */
	public static LazySingleton getInstance() {
		try {

			if (Instance != null) {

			} else {
				Thread.sleep(3000);
				//既保证了不需要同步代码的异步执行性，有保证了单例效果
				//书中的同步代码的异步执行性这样的描述没懂？？？
				synchronized (LazySingleton.class) {
					//保证进入这块代码是异步，如果已经实例化，则不再执行初始化代码
					if (Instance==null) {
						Instance = new LazySingleton();	
					}				
				}
			}
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		return Instance;
	}
}
