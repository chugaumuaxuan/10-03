package CreateStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamCollectionEXP {
	Collection<String> collection = Arrays.asList("a", "b", "c");
	Stream<String> streamOfCollection = collection.stream();
}
