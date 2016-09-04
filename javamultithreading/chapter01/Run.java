package chapter01;

public class Run {

	public static void main(String[] args) throws InterruptedException{
//		final MyObject myObject = new MyObject();
//		Thread thread1 = new Thread(){
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//			myObject.setValue("a", "aa");
//			}
//		};
//		
//		thread1.setName("a");
//		thread1.start();
//		Thread.sleep(500);
//		Thread thread2 = new Thread(){
//			public void run() {
//				myObject.printUsernamePassword();
//			};
//		};
//		thread2.start();
		
		
		try{
			MyThread thread = new MyThread();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(6000);
			System.out.println("stop");
		}catch(InterruptedException exception){
			
		}

	}

}
