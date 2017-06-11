package lambda.chapter8;

import java.awt.event.MouseWheelEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class Chapter8Test {

	private static int upTo = 100;

	public static void main(String[] args) {

		Chapter8Test test = new Chapter8Test();

		Macro macro = new Macro();
		// record
		macro.run();
		int count = 0;
		for (int i = 0; i < upTo; i++) {
			if (test.isPrime(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	// 判断是否质数
	private boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 一定范围数据中质数的个数
	private long countPrimes(int upTo) {
		return IntStream.range(1, upTo).filter(this::isPrimee).count();
	}

	// 判断是否是质数
	private boolean isPrimee(int number) {
		return IntStream.range(2, number).allMatch(x -> (number % x) != 0);

	}
	
	public List<String> findHeading842(Reader input) throws IOException{
		
			BufferedReader reader = new BufferedReader(input);
			return reader.lines()
					.filter(line->line.endsWith(":"))
					.map(line->line.substring(0,line.length()-1))
					.collect(Collectors.toList());
	}
	
	
	public List<String> findHeadings(Reader input){
		return withLinesOf(input,
				lines->lines.filter(line->line.endsWith(":"))
					.map(line->line.substring(0, line.length()-1))
					.collect(Collectors.toList()),
				HeadingLookupException::new);
	}
	
	//List<String> 替换为 <T>
	private List<String> withLinesOf(Reader input,
				Function<Stream<String>,List<String>> handler,
				Function<IOException, RuntimeException> error) {
		try (BufferedReader reader = new BufferedReader(input)){
			return handler.apply(reader.lines());
		} catch (IOException e) {
			throw error.apply(e);
		}
	}
	
	
	
	

}
