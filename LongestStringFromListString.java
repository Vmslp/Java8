import java.util.List;

public class LongestStringFromListString {

	public static void main(String[] args) {
		List<String> str = List.of("mohan", "sai", "lakshman", "sunitha", "phanindra");

		String result = str.stream().max((str1, str2) -> Integer.compare(str1.length(), str2.length())).get();
		System.out.println(result);
	}

}
