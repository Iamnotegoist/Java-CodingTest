package java_codingTest.sourceCode.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 프로그래머스_두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++)
				set.add(numbers[i] + numbers[j]);
		}
		
		int[] result = set.stream().mapToInt(Integer::intValue).sorted().toArray(); // stream() ==> stream<Integer>, mapToInt(Integer::intValue) ==> IntStream, toArray() ==> int[]
		System.out.println(Arrays.toString(result));
		
	}
}
