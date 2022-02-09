
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Take a nested list and return a single flattened list with all values except nil/null.

public class Flattener {

	
	public static List<Object> flatten(List<Object> input) {
		
		return input
				.stream() //sequential stream
				//stream.flatMap method is specialized map that flattens a nested stream structure
				.flatMap(i -> i instanceof List ? //asks: is e an instance of List?
						Flattener.flatten((List<Object>) i).stream() : //if true, streams objects
							//of that list
							Stream.of(i)) //creates a sequential stream of 'i'
				.filter(Objects::nonNull) //filters out null objects
				.collect(Collectors.toList()); //terminates as a list

	}
}