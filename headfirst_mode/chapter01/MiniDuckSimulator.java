package chapter01;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck duck = new  MallardDuck();
		duck.performFly();
		duck.performQuck();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
