package chapter02;

public class RunTwoIbject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		HasSelfPrivateNum numRefb = new HasSelfPrivateNum();
		ThreadA aThreadA = new ThreadA(numRef);
//		aThreadA.start();
		ThreadB aThreadB = new ThreadB(numRefb);
		aThreadB.start();
		aThreadA.start();
	}

}
