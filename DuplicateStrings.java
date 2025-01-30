import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStrings {

	public static void main(String[] args) {
		List<String> str = List.of("mohan", "sai", "lakshman", "sai");
		List<String> result = str.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println(result);

	}

}
