package chapter01;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quckBehavior = new Quck();
	}
	
	@Override
	public void display() {
		System.out.println("MallardDuck");		
	}
}
