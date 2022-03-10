package PrimitiveStream;

import java.util.Arrays;
import java.util.stream.LongStream;

public class LongStreamEXP {
	public static void main(String[] args) {
		
		LongStream stream = LongStream.of(1, 2, 3, 4, 5);
		
		LongStream stream1 = LongStream.range(10, 100);
		
		long[] array = new long[]{1, 2, 3, 4, 5};
		LongStream stream2 = Arrays.stream(array);
		
		
		
		
	}
}
