package chapter06;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonTest singletonTest = new SingletonTest();
		MyThread t1 = singletonTest.new MyThread();
		MyThread t2 = singletonTest.new MyThread();
		MyThread t3 = singletonTest.new MyThread();
		t1.start();
		t2.start();
		t3.start();

	}

	public class MyThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			 System.out.println(HungrySingleton.getInstance().hashCode());

			// System.out.println(LazySingleton.getInstance().hashCode());

			// System.out.println(StaticInnerSingleton.getInstance("123").hashCode());

			// System.out.println(StaticInnerSingleton.getInstance("12").hashCode());

			// for(int i=0;i<5;i++){
			// System.out.println(StaticBlockSingleton.getInstance().hashCode());
			// }

			// for(int i=0;i<5;i++){
			// System.out.println(EnumSingleton.connectionFactory.getConnection().hashCode());
			// }
//
//			for (int i = 0; i < 5; i++) {
//				System.out.println(EnumBetterSingleton.getConnection().hashCode());
//			}
		}
	}

}
