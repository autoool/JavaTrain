package lambda.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterUsingReduce {
	/**
	 * 只用reduce 和Lambda 表达式写出实现Stream 上的filter 操作的代码，如果不想返回
Stream，可以返回一个List
	 */
	
	public static <I> List<I> filter(Stream<I> stream,Predicate<I> predicate) {
		List<I> initial = new ArrayList<>();
		return stream.reduce(initial,
				(List<I> acc,I x)->{
					if (predicate.test(x)) {
						List<I> newAcc = new ArrayList<>(acc);
						newAcc.add(x);
						return newAcc;
					}else {
						return acc;
					}
				},
				FilterUsingReduce::combineLists);
	}
	
	private static  <I> List<I> combineLists(List<I> left,List<I> right) {
		List<I> newLeft = new ArrayList<>(left);
		newLeft.addAll(right);
		return newLeft;
	}
}
