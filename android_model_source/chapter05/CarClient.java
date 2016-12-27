package chapter05;

public class CarClient {

	public static void main(String[] args) {
		AudiFactory factory = new AudiCarFactory();
		AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
		audiQ3.drive();
		audiQ3.selfNaivgation();
		AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
		audiQ5.drive();
		audiQ5.selfNaivgation();
		AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
		audiQ7.drive();
		audiQ7.selfNaivgation();
	}	

}
