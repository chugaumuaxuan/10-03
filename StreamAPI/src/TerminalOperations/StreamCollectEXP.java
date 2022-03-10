package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectEXP {
	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println("Original numbers : "
                + numbers);
 
        List<Integer> doubledNumbers = numbers.stream().map(num -> num * 2).collect(Collectors.toList());
 
        System.out.println("Doubled numbers  : "+ doubledNumbers);
		
	}
}
