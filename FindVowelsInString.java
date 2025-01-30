import java.util.Arrays;
import java.util.List;

public class FindVowelsInString {

	public static void main(String[] args) {

		String str = "javadeveloper";
		
		List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
		
		long result = str.chars()
				         .mapToObj(c ->(char)c)
				         .filter(vowels::contains)
				         .count();
		                 System.out.println("vowels in string:"+result);

	}

}