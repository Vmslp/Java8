import java.util.List;
import java.util.stream.Collectors;

public class All0sMovingToRightSide {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 0, 1, 6, 0, 0, 0, 2, 5, 7, 0);

		List<Integer> result = moveAllOsToRight(list);
		System.out.println(result);

	}

	private static List<Integer> moveAllOsToRight(List<Integer> list) {
		return list.stream().sorted((a, b) -> a.equals(0) ? 1 : b.equals(0) ? -1 : 0).collect(Collectors.toList());
	}
}
