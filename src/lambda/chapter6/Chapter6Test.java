package lambda.chapter6;

import java.util.ArrayList;
import java.util.List;

public class Chapter6Test {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(2);
		System.out.println(multiplyThrough(integers));
	}
	
	public static int multiplyThrough(List<Integer> linkedListOfNumbers) {
		return 5*linkedListOfNumbers.parallelStream()
				.reduce(1,(acc,x)->x*acc);
	}
	
	//性能低
	public int slowSumOfSquares(List<Integer> linkedListOfNumbers) {
		return linkedListOfNumbers.parallelStream()
				.map(x->x*x)
				.reduce(0, (acc,x)->acc+x);
	}
}
