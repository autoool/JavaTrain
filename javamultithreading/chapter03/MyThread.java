package chapter03;

import java.util.ArrayList;
import java.util.List;

public class MyThread {

	public static void main(String[] args) {
		List<String> listStr = new ArrayList<>();
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
