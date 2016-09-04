package chapter02;

public class Task {
	private String getData1;
	private String getData2;

	public  void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			String get1 = "1 " + Thread.currentThread().getName();
			String get2 = "2 " + Thread.currentThread().getName();
			synchronized (this) {
				getData1 = get1;
				getData2 = get2;
			}
			
//			 getData1 = "1 " + Thread.currentThread().getName();
//			 getData2 = "2 " + Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
