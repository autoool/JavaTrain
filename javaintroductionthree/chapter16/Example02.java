package chapter16;

import java.util.Iterator;

public class Example02 {
	static void staticMethod(){
		System.out.println("staticMethod");
	}
	
	public int publicMethod(int i){
		System.out.println("publicMethod");
		return i*100;
	}
	
	protected int protectedMethod(String s,int i) throws NumberFormatException{
		System.out.println("protectedMethod");
		return Integer.valueOf(s)+i;
	}
	
	private String privateMethod(String... strings) {
		System.out.println("privateMethod");
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strings.length; i++) {
			stringBuffer.append(strings[i]);
		}
		return stringBuffer.toString();
	}
}
