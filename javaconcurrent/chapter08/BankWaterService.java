package chapter08;

import java.util.Map.Entry;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BankWaterService implements Runnable{

	private CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
	
	private Executor executor = Executors.newFixedThreadPool(4);
	
	private ConcurrentHashMap<String, Integer> sheetCount = new ConcurrentHashMap<>();
	
	private void count(){
		for (int i = 0; i < 4; i++) {
			executor.execute(new Runnable() {
				
				@Override
				public void run() {				
					sheetCount.put(Thread.currentThread().getName(), 1);
					try {
						cyclicBarrier.await();
					} catch (InterruptedException |
							BrokenBarrierException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			});
		}

	}

	@Override
	public void run() {	
		int result = 0;
		for(Entry<String, Integer> sheet : sheetCount.entrySet()){
			result+= sheet.getValue();
		}
		sheetCount.put("result", result);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		BankWaterService bankWaterService = new BankWaterService();
		bankWaterService.count();
		new Thread(bankWaterService).start();
	}

}
