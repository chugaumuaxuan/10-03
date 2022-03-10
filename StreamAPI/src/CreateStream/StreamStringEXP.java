package CreateStream;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStringEXP {
	
	public static void main(String[] args) {
		
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p -> System.out.println(p));

	}
}
