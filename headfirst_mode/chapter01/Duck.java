package chapter01;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuckBehavior quckBehavior;
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuckBehavior(QuckBehavior quckBehavior) {
		this.quckBehavior = quckBehavior;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuck() {
		quckBehavior.quck();
	}
	
	public void swim() {
		System.out.println("All ducks float,even decoys!");
	}
}
