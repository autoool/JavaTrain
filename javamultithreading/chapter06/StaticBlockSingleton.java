package chapter06;

public class StaticBlockSingleton {
	private static StaticBlockSingleton Instance = null;

	private StaticBlockSingleton() {

	}
	/*
	 * 静态代码块在使用来的时候已经执行
	 */
	static{
		Instance = new StaticBlockSingleton();
	}
	
	public static StaticBlockSingleton getInstance() {
		return Instance;
	}
}
