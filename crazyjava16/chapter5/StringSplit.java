package chapter5;

public class StringSplit {
	
	public static void main(String[] args) {
		String string = "java.str.vnp.str";
		String[] strings = string.split(".");
		for(String item:strings){
			System.out.println(item);
		}
		String path = string.replace(".", "\\");
		System.out.println(path);
		String path2 = string.replaceAll("\\."
				, "\\\\");
		System.out.println(path2);
	}
}
