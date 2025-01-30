import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodSumofNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		Integer sum = list.stream()
				          .reduce(Integer::sum)
				          .get();
		
		System.out.println(sum);
		
		
		Optional<Integer> result = list.stream()
				                       .filter(x->x%2==1)
				                       .map(x->x*x)
				                       .reduce(Integer::sum);
		
		System.out.println(result.get());
	}
	
	
	

}
