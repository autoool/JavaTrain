package lambda.test;

import java.util.Vector;

public class LeakTest {
	
	public static void main(String[] args) {
		Vector<Object> vector = new Vector<>();
		for(int i=0;i<10;i++){
			Object object = new Object();
			vector.add(object);
			object = null;
			/**
			 * 對象還在內存棧中，但是引用的對象在堆中。
			 * 對象=null,也就是對象不再指向引用，但是引用的對象仍然在。
			 * vector 只是指向了引用的對象
			 */
		}
		for (int i = 0; i < vector.size(); i++) {
			if (vector.get(i)==null) {
				System.out.println("null");
			}else {
				System.out.println("not null");
			}
		}
		System.out.println("lambda/test");
	}
}
