import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenOddNumbers {

	

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 32, 76, 76, 98, 34, 53, 5);

//  Given a list of integers, find out all the even numbers exist in the list using Stream functions?  //

		List<Integer> collect = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("even numbers are  :" + collect);

//  Given a list of integers, find out all the odd numbers exist in the list using Stream functions?  //

		List<Integer> collect2 = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("odd numbers are :" + collect2);
		
//  Given a list of integers, find out all the even & odd numbers exist in the list using Stream functions?  //

		Map<Boolean, List<Integer>> partitionedNumbers = list.stream()
				                                             .collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(partitionedNumbers);

	        List<Integer> evenNumbers = partitionedNumbers.get(true);
	        List<Integer> oddNumbers = partitionedNumbers.get(false);

	        System.out.println("Even numbers are: " + evenNumbers);
	        System.out.println("Odd numbers are: " + oddNumbers);
	}
}











