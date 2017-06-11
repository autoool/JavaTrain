package lambda.chapter04;

public interface SumInterface {
	public default  void add(){
		System.out.println("Sum");
	};
}
