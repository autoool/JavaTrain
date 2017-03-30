package lambda.chapter03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import lambda.LambdaTest;

public class Chapter03 {

	public static void main(String[] args) {
		Chapter03 chapter03 = new Chapter03();
	
	}

	// 3.9-6
	public static int countLowercaseLetters(String string) {
		return (int) string.chars().filter(Character::isLowerCase).count();
	}

	// 3.9-7
	public static Optional<String> moreLowercaseString(List<String> strings) {
		return strings.stream().max(Comparator.comparing(LambdaTest::countLowercaseLetters));
	}

	/**
	 * 只用reduce 和Lambda 表达式写出实现Stream 上的map 操作的代码，如果不想返回 Stream，可以返回一个List
	 * 
	 * @return
	 */
	public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
		return stream.reduce(new ArrayList<O>(), (acc, x) -> {
			List<O> newAcc = new ArrayList<>(acc);
			newAcc.add(mapper.apply(x));
			return newAcc;
		} , (List<O> left, List<O> right) -> {
			List<O> newLeft = new ArrayList<>(left);
			newLeft.addAll(right);
			return newLeft;
		});
	}
	
	
	
	

	private List<String> getListStr() {
		List<String> strList = new ArrayList<>();
		strList.add("111");
		strList.add("landon");
		strList.add("landon");
		strList.add("landon");
		strList.add("landon");
		return strList;
	}

	private int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (acc, x) -> acc + x);

	}

}
