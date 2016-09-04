package array;

import java.util.Arrays;
import java.util.Collections;

import net.mindview.util.Generator;
import net.mindview.util.Print;
import net.mindview.util.RandomGenerator;

public class E23_ArraySort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		Integer[] a = Generated.array(new Integer[8], gen);
		Print.print(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		Print.print(Arrays.toString(a));
	}
}
