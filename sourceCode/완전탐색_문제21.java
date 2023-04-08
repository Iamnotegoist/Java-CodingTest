package java_codingTest.sourceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class 완전탐색_문제21 {

	private static boolean isPrime(int n) {
		if(n <= 1) return false;
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	private static void getPrimes(int acc, List<Integer> numbers, Set<Integer> primes) {
		if(isPrime(acc)) primes.add(acc); //acc가 소수이면 primes Set에 추가한다. 
		
		for(int i = 0; i < numbers.size(); i++) {
			int nextAcc = acc * 10 + numbers.get(i);
			List<Integer> nextNumbers = new ArrayList<>(numbers);
			nextNumbers.remove(i);
			getPrimes(nextAcc, nextNumbers, primes);
		}
	}
		
	public static void main(String[] args) {
		Set<Integer> primes = new HashSet<>();
		List<Integer> numbers = "011".chars()
									.map(c -> c - '0')
									.boxed()
									.collect(Collectors.toList());
		getPrimes(0, numbers, primes);
		System.out.println(primes.size());
		
	}
}
