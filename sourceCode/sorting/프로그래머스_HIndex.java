package java_codingTest.sourceCode.sorting;

import java.util.Arrays;

public class 프로그래머스_HIndex {
	
	static boolean isValid(int[] citations, int h) {
		int index = citations.length - h;
		return citations[index] >= h;   
	}
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		Arrays.sort(citations); // [0, 1, 3, 5, 6]
		System.out.println(Arrays.toString(citations));
		for(int h = citations.length; h >= 1; h--) {
			if(isValid(citations, h)) {
				System.out.println(h);
				return;
			}
		}
		System.out.println(0);
	}
}
