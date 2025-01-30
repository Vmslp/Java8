import java.util.Arrays;
import java.util.List;

public class StartsWithLetterA {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("frdtd", "Ftfhg", "gfddd", "awawer", "Arddrjy");

		list.stream().filter(w -> w.toLowerCase().startsWith("a")).forEach(System.out::println);

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?  //	

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32,3,9,26,76,11,200);
		
		myList.stream().filter(n-> n.toString().startsWith("2")).forEach(System.out::println);
	}
}