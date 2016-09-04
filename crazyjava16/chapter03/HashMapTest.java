package chapter03;

import java.util.HashSet;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 1;
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("1");
		hashSet.add("2");
		System.out.println(hashSet.toString());
		Set<String> set = new HashSet<>();
		set.add("123");
		capacity <<= 3;
		System.out.println(capacity);
	}

}
