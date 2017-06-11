package lambda.chapter05;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class StringColector implements Collector<String, StringCombiner, String>{

	private static final Set<Characteristics> CHARACTERISTICS = Collections.emptySet();
	private final String prefix;
	private final String suffix;
	private final String delim;
	private StringBuilder builder;
	
	public StringColector(String delim,String prefix,String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.delim  = delim;
	}
	
	@Override
	public Supplier<StringCombiner> supplier() {
		// TODO Auto-generated method stub
		return ()->new StringCombiner(delim, prefix, suffix);
	}
	
	@Override
	public BiConsumer<StringCombiner, String> accumulator() {
		// TODO Auto-generated method stub
		return StringCombiner::add;
	}
	
	@Override
	public BinaryOperator<StringCombiner> combiner() {
		// TODO Auto-generated method stub
		return StringCombiner::merge;
	}
	
	@Override
	public Function<StringCombiner, String> finisher() {
		// TODO Auto-generated method stub
		return StringCombiner::toString;
	}
	
	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return CHARACTERISTICS;
	}
	
}
