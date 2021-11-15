package geekster;

import java.util.Arrays;

public class Valid_anagram {
    public static void main(String []args) {
    	String a="aman";
    	String b="mana";
    	if(a.length() != b.length()) {
    		System.out.println("Not valid anagram");
    	}
    	char []ch1=a.toCharArray();
    	char []ch2=b.toCharArray();
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	
    	if(Arrays.equals(ch1, ch2)) {
    		System.out.println("Valid anagram");		
    	}
    	else {
    		System.out.println("Not valid anagram");
    	}
    }
}
