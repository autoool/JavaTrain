package array;

import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generator;
import net.mindview.util.Print;
import net.mindview.util.RandomGenerator;

public class ArrraySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
//		Arrays.sort(a);
		Print.print("sort array: " + Arrays.toString(a));
		//未排序二分查找结果不可预知
		int loca1 = Arrays.binarySearch(a, a[10]);
		Print.print("a[10] "+ a[10] +" is "+loca1);
		int local2 = Arrays.binarySearch(a, a[5]);
		Print.print("a[5] "+a[5] +" is "+local2);
//		while(true){
//			int r = gen.next();
//			int location = Arrays.binarySearch(a, r);
//			Print.print(location);
//			if (location>0) {
//				Print.print(r + " "+ location + " " + a[location]);
//				break;
//			}
//		}

	}

}
