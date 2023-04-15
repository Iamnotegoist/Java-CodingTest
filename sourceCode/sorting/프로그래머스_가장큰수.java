package java_codingTest.sourceCode.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 프로그래머스_가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		
		String number = Arrays.stream(numbers) // intStream
			  .mapToObj(String::valueOf) // Stream<String>
			  .sorted((s1, s2) -> {
				  int original = Integer.parseInt(s1 + s2);
				  int reversed = Integer.parseInt(s2 + s1);
				  return reversed - original;
			  })
			  .collect(Collectors.joining(""))
			  .replaceAll("^0+", "0");
	
		System.out.println(number);
	}
}
