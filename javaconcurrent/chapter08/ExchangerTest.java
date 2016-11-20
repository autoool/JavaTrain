package chapter08;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerTest {

	private static final Exchanger<String> exgr = new Exchanger<>();
	private static ExecutorService executorService = Executors.newFixedThreadPool(2);
	
	public static void main(String[] args) {
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
					String A="yin hang liushui A";
					exgr.exchange(A);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}				
			}
		});
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				try {
					String B = "yin hang liushui B";
					String A = exgr.exchange("B");
					System.out.println("A B数据是否一致 "+"A: "+A+"  B:"+B);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		});
		executorService.shutdown();

	}

}
