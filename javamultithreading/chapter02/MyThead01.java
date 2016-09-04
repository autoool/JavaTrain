package chapter02;

public class MyThead01 {
	
	static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		for(int j=0;j<100;j++)
			count++;
		System.out.println(count);
	}

}
