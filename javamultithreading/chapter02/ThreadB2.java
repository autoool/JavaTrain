package chapter02;

public class ThreadB2 extends Thread{
	private HasSelfPrivateNum numRef;
	public ThreadB2(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		numRef.addI("b");
	}

}
