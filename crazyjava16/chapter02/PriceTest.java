package chapter02;

class Price {
	
	static Price Instance = new Price(2.8);
	static double initPrice = 20;
	double currentPrice;
	public Price(double discount){
		currentPrice = initPrice - discount;
	}

}

public class PriceTest {
	public static void main(String[] args) {
		System.out.println(Price.Instance.currentPrice);
		Price price = new Price(2.8);
		System.out.println(price.currentPrice);
	}
}
