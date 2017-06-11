package chapter6;

public class Test01 {
	
	private  double primaryFource;
	private int delay;
	private double secondaryFource;
	private double mass;
	
	private double getDistanceTravelled(int time){
		double result;
		final double primaryAcc = primaryFource/mass; 
		int primaryTime = Math.min(time, delay);
		result = 0.5*primaryAcc*primaryTime*primaryTime;
		int secondaryTime = time-delay;
		return result;
	}
	
	private Person person= new Person("zc", "10");
	
	private void name(final Person person) {
		person.setName("23");
	}
	
	
}
