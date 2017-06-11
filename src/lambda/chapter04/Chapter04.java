package lambda.chapter04;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import lambda.LambdaTest;

import static org.junit.Assert.*;

public class Chapter04 {
//	IntSummaryStatistics
//	Objects objects
	
	@Test
	public void testOptional(){
		Optional emptyOptional = Optional.empty();
		Optional alsoEmpty = Optional.ofNullable(null);
		assertFalse(emptyOptional.isPresent());
		assertFalse(alsoEmpty.isPresent());
		TreeSet<String> treeSet = LambdaTest.getListStr().stream().collect(Collectors.toCollection(TreeSet::new));
		treeSet.stream().forEach(x->{
			System.out.println(x);
		});
		
	}
}
