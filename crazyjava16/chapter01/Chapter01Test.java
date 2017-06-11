package chapter01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Chapter01Test {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(3);
//		strings.add(0, "2");
//		strings.add(1, "2");
//		strings.add(0, "2");
		strings.add("1");
		strings.add("2");
		strings.add("3");
		//当访问倒数第二个元素时，size() 变为size()-1,hasNext() 即将访问的最后一个元素索引等于集合大小，返回false  不会访问最后一个元素
		//当访问其他元素（非倒数第二个），执行删除操作，造成集合修改次数和遍历之前的修改次数不相等，抛出异常
		for (Iterator iterator = strings.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (string.equals("3")) {
				strings.remove(2);
			}
		}
		System.out.println(strings);
		Set<String> strings2 = new HashSet<>();
	}
}
