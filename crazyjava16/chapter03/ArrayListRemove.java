package chapter03;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("1111");
		list.add("2222");
		list.add("3333");
		for(Iterator<String> iterator = list.iterator();iterator.hasNext();){
			String ele = iterator.next();
			if (ele.equals("1111")) {
				list.remove(ele);
			}
		}
	}

}
