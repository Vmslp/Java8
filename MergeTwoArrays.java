import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrays {
	
	public static void main(String[] args) {
		
		Integer[] arr1 = {2,3,4,5,5,7,4,3};
		Integer[] arr2 = {3,6,8,8,5,4,1,2};
		
		List<Integer> arrayList = Stream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
				                        .distinct()
				                        .sorted()
				                        .collect(Collectors.toList());
		System.out.println(arrayList);
		
		}
}
