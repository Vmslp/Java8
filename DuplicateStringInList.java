import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringInList {
	
	public static void main(String[] args) {
		List<String> string = List.of("sai", "lakshman", "mohan", "sai");

		List<String> stringObj = string.stream()
				                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				                       .entrySet()
				                       .stream()
				                       .filter(entry -> entry.getValue() > 1)
				                       .map(Map.Entry::getKey)
				                       .collect(Collectors.toList());

		System.out.println(stringObj);
	}

}
