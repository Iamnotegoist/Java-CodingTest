package java_codingTest;

import java.util.Arrays;
import java.util.stream.Stream;

public class 완전탐색_문제22 {

	public static void main(String[] args) {
		String[] bannedId = new String[]{"fr*d*", "abc1**"};
		String[] userId = new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"};
		
		Stream<String> stream = Arrays.stream(bannedId);
		
		String[][] bans = Arrays.stream(bannedId)
							    .map(banned -> banned.replace('*', '.'))
							    .map(banned -> Arrays.stream(userId)
							  		    	   	     .filter(id -> id.matches(banned))
							  		  			     .toArray(String[]::new))
							    .toArray(String[][]::new);
		
		
		
	}
}
