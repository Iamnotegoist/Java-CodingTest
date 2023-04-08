package java_codingTest;

import java.util.ArrayList;
import java.util.List;

public class 연습장 {
	
	private static final char[] chars = "AEIOU".toCharArray();
	
	private static void generate(String word, List<String> words) {
		words.add(word);
		
		if(word.length() == 5) {
			return;
		}
		
		for(char c : chars) {
			generate(word + c, words);
		}
			
		
	}
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		generate("", words);
		
		System.out.println(words.indexOf("I"));
	}
}
