package PrimitiveStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEXP {
	public static void main(String[] args) {
		
		IntStream stream = IntStream.of(1, 2, 3, 4, 5);
		
		IntStream stream1 = IntStream.range(1, 10);  

		int[] array = new int[]{1, 2, 3, 4, 5};
		IntStream stream2 = Arrays.stream(array);
		
		int max = IntStream.of(10, 18, 12, 70, 5).max().getAsInt();
	}
}
