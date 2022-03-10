package TerminalOperations;

import java.util.ArrayList;
import java.util.List;

public class StreamCountEXP {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Nguyen");
		memberNames.add("Tran");
		memberNames.add("Pham");
		
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("N")).count();
			 
			System.out.println(totalMatched); 
	}
	
	
}
