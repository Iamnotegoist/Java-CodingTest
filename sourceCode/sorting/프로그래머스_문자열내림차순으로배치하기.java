package java_codingTest.sourceCode.sorting;

import java.util.List;
import java.util.stream.Collectors;

public class 프로그래머스_문자열내림차순으로배치하기 {
	public static void main(String[] args) {
		String s = "Zbcdefg";

		List<Integer> chars = s.chars() // 문자열 s를 intStream으로 변환
				.boxed() // intStream을 Stream<Integer>로 변환
				.sorted((v1, v2) -> v2 - v1) // 내림차순으로 정렬
				.collect(Collectors.toList());
		String sortedS = new String();
		
		for(int c: chars) {
			sortedS += (char) c;
		}
		
		System.out.println(sortedS);
	}
}
