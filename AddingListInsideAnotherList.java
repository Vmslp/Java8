import java.util.List;
import java.util.stream.Collectors;

public class AddingListInsideAnotherList {

	public static void main(String[] args) {

		List<List<Integer>> list = List.of(List.of(1, 2, 3,4),
				                           List.of(4, 5, 6));

		List<Integer> result2 = list.stream().flatMap(List::stream).filter(num -> num % 2 == 0)
				.collect(Collectors.toList());

		System.out.println(result2);

		List<List<String>> ll = List.of(List.of("java", "springboot"),
				                        List.of("microservices", "angulsar"),
				                        List.of("linux", "jenkins", "aws"));

		List<String> qre = ll.stream().flatMap(st -> st.stream()).filter(rt -> rt.startsWith("j"))
				.collect(Collectors.toList());

		System.out.println(qre);

	}
}
