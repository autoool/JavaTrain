package container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unsupported {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("A B C V F".split(" "));
//		list.add(0, "G");
		
		ArrayList<String> list1 =new  ArrayList<String>( Arrays.asList("A B C V F".split(" ")));
		list1.retainAll( new ArrayList<>(list));
	}

}
