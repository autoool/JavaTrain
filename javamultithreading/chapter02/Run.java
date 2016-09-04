package chapter02;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		ThreadA aThreadA = new ThreadA(numRef);
		aThreadA.start();
		ThreadB aThreadB = new ThreadB(numRef);
		aThreadB.start();
	}

}
