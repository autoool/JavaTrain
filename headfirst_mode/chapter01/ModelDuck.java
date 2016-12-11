package chapter01;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quckBehavior = new Quck();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
