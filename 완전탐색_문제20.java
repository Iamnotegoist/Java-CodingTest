package java_codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 완전탐색_문제20 {
    private static final String[][] precedences = {
           "+-*".split(""),
           "+*-".split(""),
           "-+*".split(""),
           "-*+".split(""),
           "*+-".split(""),
           "+-+".split("")
       };
   
   private static long calculate(long lhs, long rhs, String op) {
       if(op.equals("+"))
    	   return lhs + rhs;
       else if(op.equals("-"))
    	   return lhs - rhs;
       else if(op.equals("*"))
    	   return lhs * rhs;
       else
    	   return 0;
   }
   
   private static long calculate(List<String> tokens, String[] precedence) {
       for(String op: precedence) {
           for(int i = 0; i < tokens.size(); i++) {
               if(tokens.get(i).equals(op)) {
                   long lhs = Long.parseLong(tokens.get(i - 1));
                   long rhs = Long.parseLong(tokens.get(i + 1));
                   long result = calculate(lhs, rhs, op);
                   tokens.remove(i - 1);
                   tokens.remove(i - 1);
                   tokens.remove(i - 1);
                   tokens.add(i - 1, String.valueOf(result));
                   i -= 2;
               }
           }
       }
       return Long.parseLong(tokens.get(0));
   }
   
   public static long solution(String expression) {
       StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
       List<String> tokens = new ArrayList<>();
       while(tokenizer.hasMoreTokens()) {
           tokens.add(tokenizer.nextToken());
       }
       long max = 0;
       System.out.println(tokens);
       for(String[] precedence : precedences) {
           long value = Math.abs(calculate(new ArrayList<>(tokens), precedence));
           System.out.println(value);
           
           if(value > max) {
               max = value;
           }
       }
       return max;
   }
   
   public static void main(String[] args) {
	   String expression = new String("50*6-3*2");
	   
	   System.out.println(solution(expression));
	  
   }
}
