package java_codingTest.sourceCode.sorting;

import java.util.Arrays;

public class 프로그래머스_K번째수 {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < answer.length; i++) {
			int[] command = commands[i];
			int from = command[0] - 1;
			int to = command[1];
			int k = command[2] - 1;
			
			int[] sub = Arrays.copyOfRange(array, from, to);   // Arrays.copyOfRange(int[] original, int from, int to) ==> 원하는 구간으로 배열을 자름 
			Arrays.sort(sub);
			answer[i] = sub[k];
		}
		
	}
}
