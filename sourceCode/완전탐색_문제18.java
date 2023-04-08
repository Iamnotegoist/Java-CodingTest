package java_codingTest.sourceCode;

import java.util.stream.IntStream;

public class 완전탐색_문제18 {

	private static final int[][] RULES = {
			{1, 2, 3, 4, 5},
			{2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
	};
	
	private static int getPicked(int person, int problem) {
		int[] rule = RULES[person];
		int index = problem % rule.length;
		for(int i: rule) {
			System.out.print(i + " ");
		}
		System.out.println();
		return rule[index];
	}
	
	public static void main(String[] args) {
//		int[] answers = {1, 2, 3, 4, 5};
		int[] answers = {1, 3, 2, 4, 2};
		
		int[] corrects = new int[3];
		int max = 0;
		
		for(int problem = 0; problem < answers.length; problem++) {
			int answer = answers[problem];
			
			for(int person = 0; person < 3; person++) {
				int picked = getPicked(person, problem);
				if(answer == picked) {
					if(++corrects[person] > max) {
						max = corrects[person];
					}
				}
			}
		}
		
		final int maxCorrects = max;
		
		int[] result = IntStream.range(0, 3)
								 .filter(i -> corrects[i] == maxCorrects)
								 .map(i -> i + 1)
								 .toArray();
		for(int i: result) {
//			System.out.print(i + " ");
		}
	}
}
