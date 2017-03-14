package chapter06;

import java.util.ArrayList;
import java.util.List;

public class ForTest {
	
	public static void main(String[] args) {
		String[] strs = {"aaa","bbb","vcvv"};
		for(int i=0;i<strs.length;i++);
		{
//			System.out.println(strs[i]);
		}
		
//		for(int i=0;i<10;i++){
//			System.out.println(i);
//			i *=0.1;
//		}
//		float cai = 999999999;
//		System.out.println(cai);
//		System.out.println(cai+1);
//		System.out.println(cai+20);
//		System.out.println(cai+50);
		
		List<String> books = new ArrayList<>();
		books.add(new String("aaaa"));
		books.add(new String("bbbb"));
		books.add(new String("cccc"));
		books.add(new String("dddd"));
		for (String string : books) {
			if (string.equals("aaaa")) {
				books.remove(string);
				break;
			}
		}
		
		for(int i=0;i<books.size();i++){
			String item = books.get(i);
			item = "eee";
			System.out.println(item.hashCode());
			System.out.println(books.get(i).hashCode());
		}
		
		for(int i=0;i<books.size();i++){
			books.toArray()[i] = ""; 
		}
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("aaa"));
		list.add(new Person("bbb"));
		for(int i=0;i<list.size();i++){
			list.get(i).setName("e");
			System.out.println(list.get(i).getName());
		}
		
		System.out.println(books);
		
			
		/**
		 * 对象可以赋值
		 * 数组基础类型则不能改变？
		 */
	}
}
