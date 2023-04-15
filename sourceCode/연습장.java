package java_codingTest.sourceCode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 연습장 {
	
	public static void main(String[] args) {
		
		Stream.of(1.0, 2.0) // Stream<Double>
			  .mapToInt(Double::intValue) // IntStream
			  .mapToObj(String::valueOf) // Stream<String>
			  .collect(Collectors.toList());
		
		
	}
}
