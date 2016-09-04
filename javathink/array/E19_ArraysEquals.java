package array;

import net.mindview.util.Print;

class DataHolder{
	protected int data;
	public DataHolder(int data) {
		this.data = data;
	}
} 

public class E19_ArraysEquals {
 public static void main(String[] args) {
	String str1 = "1";
	String str2 = "1";
	Integer int1 = 2;
	Integer int2 = 2;
	DataHolder dataHolder1 = new DataHolder(1);
	DataHolder dataHolder2 = new DataHolder(1);
	Print.print(str1.equals(str2));
	Print.print(int1.equals(int2));
	Print.print(dataHolder1.equals(dataHolder2));
}
}
