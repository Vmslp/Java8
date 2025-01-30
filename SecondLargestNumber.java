import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> li = List.of(6,5,3,1); //6531 = 5  //1356 = 3
		
		List<Integer> ascendingOrder = li.stream().sorted().collect(Collectors.toList());
		System.out.println("ascending values from list :"+ascendingOrder);

		List<Integer> descedingOrder = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("descending values from list :"+descedingOrder);

		Integer secondHighest = li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("SecondHigest number :" + secondHighest);
		
	}
}
