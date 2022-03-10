package TerminalOperations;

import java.util.Arrays;

public class StreamForEachEXP {
	public static void main(String[] args) {
		 String[] letters = new String[]{"a", "b", "c"};
	        Arrays.stream(letters).forEach((String letter) -> {
	            System.out.println(letter);
	        });
		
	}
}
