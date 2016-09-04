package chapter03;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		treeMap.put("123", 5);
		System.out.println(treeMap.put("123", 1));
	}

}
