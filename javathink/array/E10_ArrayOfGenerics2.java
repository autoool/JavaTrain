package array;

import java.util.List;
import java.util.ArrayList;

public class E10_ArrayOfGenerics2 {

	public static void main(String[] args) {		
		ArrayList<List<String>> lists = new ArrayList<List<String>>();
		lists.add(new ArrayList<String>());
//		lists.add(new ArrayList<Integer>());
		lists.get(0).add("11111111");
		
	}
}
