package TerminalOperations;

import java.util.ArrayList;
import java.util.List;

public class StreamMatchEXP {
	public static void main(String[] args) {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Nguyen");
		memberNames.add("Tran");
		memberNames.add("Pham");
		
		
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);     
		 
		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);     
		 
		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);  
	}
}
