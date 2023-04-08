package java_codingTest.sourceCode;

import java.util.ArrayList;
import java.util.List;

public class 재귀_문제16_하노이의탑 {
	
	private static void hanoi(int n, int from, int to, List<int[]> process) {
		if(n == 1) {
			process.add(new int[] {from, to});
			return;
		}
		
		int empty = 6 - from - to;
		
		hanoi(n - 1, from, empty, process);
		hanoi(1, from, to, process);
		hanoi(n - 1, empty, to, process);
	}
	public static void main(String[] args) {
		List<int[]> process = new ArrayList<>();
		int n = 2;
		hanoi(2, 1, 3, process);
			//hanoi(1, 1, 2, [[]])
				//[[1, 2]]
			//hanoi(1, 1, 3, [[1,2]])
				//[[1,2], [[1,3]]
			//hanoi(1, 2, 3, [[1,2], [[1,3]])
				// [[1,2], [[1,3], [2,3]]
		
		
	}
}
