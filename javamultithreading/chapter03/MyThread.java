package chapter03;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread thread = new Thread(new Runnable() {
				Thread.State state = Thread.State.RUNNABLE;
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
			});
			
			thread.start();
	}

}
