package chapter02;

public class ThreadA2 extends Thread{
	private Service service;
	public ThreadA2(Service service) {
		super();
	this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.testMethod();
	}

}
