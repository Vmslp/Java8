import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinValues {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 32, 76, 13);

		Integer max_value = list1.stream().max(Comparator.naturalOrder()).get();
		System.out.println("maximim value in ths list:" + max_value);
		
		
		List<Integer> list2= Arrays.asList(1, 32, 76, 76, 98, 34, 53, 5, 45, 7754, 3242, 787, 8, 32, 2113);
		
		Integer min_value = list2.stream().min(Comparator.naturalOrder()).get();
		System.out.println("minimum value in this list:"+ min_value);

	}
}
