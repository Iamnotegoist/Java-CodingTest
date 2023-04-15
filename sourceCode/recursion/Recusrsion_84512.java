package java_codingTest.sourceCode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recusrsion_84512 {
	public static final char[] CHARS = "AEIOU".toCharArray();
	
	public static void generate(String word, List<String> words) {
		words.add(word);
		
		if(word.length() == 5) return;
		
		for(char c: CHARS) {
			generate(word + c, words);
		}
	}
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		generate("", words);
		
		System.out.println(words.indexOf("AAAAE"));
		
	}
}
