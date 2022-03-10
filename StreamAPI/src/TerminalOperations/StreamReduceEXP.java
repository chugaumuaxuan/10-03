package TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduceEXP {
	public static void main(String[] args) {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Nguyen");
		memberNames.add("Tran");
		memberNames.add("Pham");
		
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
		
	}
}
