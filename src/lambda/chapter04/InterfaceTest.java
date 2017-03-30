package lambda.chapter04;

public class InterfaceTest 
implements DivideInterface,SumInterface{

	
	public InterfaceTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();
		interfaceTest.add();
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}
}
