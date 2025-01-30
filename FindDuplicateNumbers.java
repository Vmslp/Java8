import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
//===========================================================================================================//



//===========================================================================================================//

//		List<Employees> students = new ArrayList<>();
//		students.add(new Employees(1, "mohan", 1000.0));
//		students.add(new Employees(2, "sai", 2000.0));
//		students.add(new Employees(3, "mohan", 1000.0));
//		students.add(new Employees(4, "lakshman", 1000.0));
//		students.add(new Employees(5, "sunitha", 2000.0));
//		students.add(new Employees(6, "sunitha", 2000.0));
//
//		List<Employees> repeatedEmployees = students.stream()
//				                                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//				                                    .entrySet()
//				                                    .stream()
//				                                    .filter(entry -> entry.getValue() > 1)
//				                                    .map(Map.Entry::getKey)
//				                                    .collect(Collectors.toList());
//
//		repeatedEmployees.forEach(System.out::println);

//====================== Duplicates in Array===1, 2, 3, 4, 6]================================================//

//		Integer[] arr = { 1, 2, 3, 4, 2, 6, 9, 1, 6 };
//
//		List<Integer> repeatedNumbers = Arrays.stream(arr)
//				                              .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
//				                              .entrySet()
//				                              .stream()
//				                              .filter(entry -> entry.getValue() > 1)
//				                              .map(Map.Entry::getKey)
//				                              .collect(Collectors.toList());
//
//		System.out.println("repeated values inside array:" + repeatedNumbers);

//==================== Duplicates in String====[a, h, n] ====================================================//

		String input = "mohan sai lakshman sunitha";
		List<Character> repeatedChars = input.chars()
				                             .mapToObj(c -> (char) c)
				                             .filter(c -> c != ' ')
				                             .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				                             .entrySet()
				                             .stream()
				                             .filter(entry -> entry.getValue()> 1)
				                             .map(Map.Entry::getKey)
				                             .collect(Collectors.toList());

		System.out.println("repeated characters inside string:" + repeatedChars);

//===================================================================================================//
		
		String inpu = "vinnakota mohan sai lakshman";

		Optional<Character> firstNonRepeatedChar = findNonRepeatedCharacter(inpu);
		System.out.println("first non repeated charater is :"+firstNonRepeatedChar.get());
	}

	private static Optional<Character> findNonRepeatedCharacter(String str) {
		Map<Character, Long> charCount = str.chars()
				                         .mapToObj(c -> (char) c)
				                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return str.chars()
	              .mapToObj(c -> (char) c) 
	              .filter(c -> charCount.get(c) == 1) 
	              .findFirst();
		
	}
}