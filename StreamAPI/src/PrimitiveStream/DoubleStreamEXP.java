package PrimitiveStream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class DoubleStreamEXP {
	public static void main(String[] args) {
		DoubleStream stream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
		
		double[] array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
		DoubleStream stream1 = Arrays.stream(array);
		
	}
}
