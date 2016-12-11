package chapter01;

public class MuteQuck implements QuckBehavior{
	@Override
	public void quck() {
		System.out.println("<<Silence>>");
	}
}
