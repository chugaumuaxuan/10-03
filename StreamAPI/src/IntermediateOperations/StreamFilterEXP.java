package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterEXP {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Nguyen","Tran","Pham");		
		//tao stream
		Stream<String> allNames = names.stream();		
		//Tao stream loc ten nhieu hon 4 chu
		Stream<String> longNames = allNames.filter(str -> str.length() > 4);
		//in 
		longNames.forEach(str->System.out.print(str+" "));
		
	}
}	
