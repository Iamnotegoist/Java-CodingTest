package java_codingTest.sourceCode.recursion;

public class Recursion_68936 {
	
	public static class Count {
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
	
	public static Count count(int offsetX, int offsetY, int size, int[][] arr) {
		int h = size / 2;
		for(int x = offsetX; x < offsetX + size; x++) {
			for(int y = offsetY; y < offsetY + size; y++) {
				if(arr[y][x] != arr[offsetY][offsetX]) {
					return count(offsetX, offsetY, h, arr).add(count(offsetX + h, offsetY, h, arr))
														  .add(count(offsetX, offsetY + h, h, arr))
														  .add(count(offsetX + h, offsetY + h, h, arr));
				}
			}
		}
		
		if(arr[offsetY][offsetX] == 1) {
			return new Count(0, 1);
		}
		return new Count(1,0);
		
	}
	
	public static void main(String[] args) {
		int[][] arr = { {1,1,0,0},
						{1,0,0,0},
						{1,0,0,1},
						{1,1,1,1} };
		
		Count c = count(0, 0, arr.length, arr);
		System.out.println(c.zero + " " + c.one);
	}
}
