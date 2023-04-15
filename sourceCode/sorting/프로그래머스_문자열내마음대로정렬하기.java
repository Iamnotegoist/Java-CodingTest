package java_codingTest.sourceCode.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 프로그래머스_문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		
		List<String> sortedStrings = Arrays.asList(strings)
									.stream()  // Stream<String>
									.sorted((v1, v2) -> v1.charAt(1) - v2.charAt(1))
									.collect(Collectors.toList());
		
		System.out.println(sortedStrings);
	}
}
