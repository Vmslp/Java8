import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterCapitol {

	public static void main(String[] args) {
		List<String> list = List.of("raju", "rani", "mantri");

		List<String> result = list.stream()
				                  .map(l -> l.substring(0,1).toUpperCase() + l.substring(1))
				                  .collect(Collectors.toList());
		System.out.println(result);
				 
			
	}

}
