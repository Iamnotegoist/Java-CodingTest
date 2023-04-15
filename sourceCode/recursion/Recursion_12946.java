package java_codingTest.sourceCode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion_12946 {

	public static void hanoi(int n, int from, int to, List<int[]> process) {
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
		hanoi(2, 1, 3, process);
		
		process.forEach((arr) -> {
			System.out.print("[");
			for(int i = 0; i < arr.length; i++)
				System.out.print(" " + arr[i] + " ");
			System.out.print("]");
			return;
		});
	}
}
