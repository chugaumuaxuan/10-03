package CreateStream;

import java.util.List;
import java.util.stream.Stream;

public class EmptyStreamEXP {
	
	Stream<String> emptyStream = Stream.empty();
	
	public Stream<String> streamOf(List<String> list) {
	    return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}
}
