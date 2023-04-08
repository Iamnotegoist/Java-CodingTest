package java_codingTest;

import java.util.Arrays;

public class 재귀_문제15 {

	private static class Count {
		public final int zero;
		public final int one;

		public Count(int zero, int one) {
			this.zero = zero;
			this.one = one;
		}
		
		
		public Count add(Count other) {
			return new Count(zero + other.zero, one + other.one);
		}
	}

	private static Count count(int offsetX, int offsetY, int size, int[][] arr) {
		int h = size / 2;
		for (int x = offsetX; x < offsetX + size; x++) {
			for (int y = offsetY; y < offsetY + size; y++) {
				if (arr[y][x] != arr[offsetY][offsetX]) {
					return count(offsetX, offsetY, h, arr).add(count(offsetX + h, offsetY    , h, arr))
							                              .add(count(offsetX    , offsetY + h, h, arr))
							                              .add(count(offsetX + h, offsetY + h, h, arr));

				}
			}
		}

		if (arr[offsetY][offsetX] == 1)
			return new Count(0, 1);

		return new Count(1, 0);

	}

	public static void main(String[] args) {
		int[][] arr = {
				{1,1,0,0},
				{1,0,0,0},
				{1,0,0,1},
				{1,1,1,1}
				};
		
		Count count = count(0, 0, arr.length, arr);
		System.out.println(arr.length);
		System.out.print(count.one + " ");
		System.out.print(count.zero + " ");
		System.out.println("");
		
		int[] arr2 = {0, 1, 2, 5, 3, 4};
		int[] arr3 = Arrays.sort(arr2);
		
		for(int i : arr2) {
			System.out.print(i + " ");
		}
	}
}
