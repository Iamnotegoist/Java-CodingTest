package java_codingTest.sourceCode;

import java.util.Arrays;

public class 연습장 {
	
	public static void main(String[] args) {
		int[] arr = {5, 3, 7, 4, 7, 4, 0, 9};
		
		int[] reversed = Arrays.stream(arr) // int[]형인 arr을 IntStream으로 변환
							   .boxed() // boxed()를 사용하여 Stream<Integer>로 변환
							   .sorted((v1, v2) -> v2 - v1)
							   .mapToInt(Integer::intValue)
							   .toArray();
		Comparator
		System.out.println(Arrays.toString(reversed));
		
	}
}
