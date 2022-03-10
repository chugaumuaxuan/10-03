package CreateStream;

import java.util.stream.Stream;

public class StreamIterateEXP {
	
	Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
	
}
