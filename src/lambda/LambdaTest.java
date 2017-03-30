package lambda;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.junit.Assert;
import org.junit.Test;

import io.reactivex.Observable;
import lambda.chapter01.Album;
import lambda.chapter01.Artist;

public class LambdaTest {

	public static void main(String[] args) {
		Runnable noArguemnt = ()-> System.out.println("123");
		Runnable runnable = ()->{
			
		};
		Runnable nultiStatement = ()->{
			 System.out.println("nultiStatement");
		};
		BinaryOperator<Integer> add = (c,y)->c+y;
		System.out.println(add.apply(1, 2));
		Thread thread = new Thread(nultiStatement);
		thread.start();
	}
	
	@Test
	public void _1c(){
		Function<Integer, Integer> one = x->x+1;
//		Function<Long,Long,Long> two = (x,y)->x+y;
		Function<Integer, Boolean> three = x->x==1;
	}
	
	@Test
	public void _2b(){
		ThreadLocal<DateFormat> threadSafeFormatter = ThreadLocal.withInitial(()->DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK));
		DateFormat format = threadSafeFormatter.get();
		Assert.assertEquals("01-Jan-1970", format.format(new Date(0)));
	}
	
	@Test
	public  void streamTest(){
		List<String> strList = getListStr();
		strList.forEach(item->{
			System.out.println(item);
		});
		long count = strList.stream()
				.filter(arts->arts.contains("landon"))
				.count();
		System.out.println(count);
		List<String> collected = Stream.of("a","b","c").collect(Collectors.toList());
		Assert.assertEquals(Arrays.asList("a","b","c"), collected);
//		for(String value:Arrays.as)
	}
	
	@Test
	public void addSum(){
		List<Integer> sums = new ArrayList<>();
		for(int i=0;i<20;i++){
			sums.add(i);
		}	
		List<String> strList = getListStr();
		AtomicInteger count = new AtomicInteger(0);
		strList.stream().forEach(ori->count.incrementAndGet());
		
		//一个参数 options
		System.out.println(sums.stream().reduce((result,element)->result+element));
		//两个参数
		System.out.println(sums.stream().reduce(
				0,
				(result,element)->result+element));
		System.out.println(sums.stream().reduce(
				0,
				(result,element)->result+element,(u,t)->t));
	}
	
	@Test
	public void testStringchars(){
		String string = "aefggggg";
		string.chars().filter(Character::isLowerCase).count();
		List<String> strings = getListStr();
	}
	//3.9-6
	public static int countLowercaseLetters(String string){
		return (int)string.chars().filter(Character::isLowerCase).count();
	}
	//3.9-7
	public static Optional<String> moreLowercaseString(List<String> strings) {
		return strings.stream()
				.max(Comparator.comparing(LambdaTest::countLowercaseLetters));
	}
	
	
	
	
	public static  List<String> getListStr() {
		List<String> strList = new ArrayList<>();
		strList.add("111");
		strList.add("landon");
		strList.add("landon");
		strList.add("landon");
		strList.add("landon");
		return strList;
	}
	
	public static List<Artist> getArtists() {
		List<Artist> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			Artist artist = new Artist("","");
			list.add(artist);
		}
		return list;
	}
	
	public static List<Album> getAlbums() {
		return null;
	}
	
	public static Observable<List<Artist>> getSavedArtists() {
		return Observable.empty();
	}
	
	private int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (acc,x)->acc+x);
	}
	
	
}
