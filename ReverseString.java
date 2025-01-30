import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {

		String string = "Sai";
		
		String output = IntStream.range(0, string.length())
				                 .mapToObj(s -> string.charAt(string.length() - 1 - s)) //reverse the string "i","a","S"
				                 .map(String::valueOf) // convert each ch to string "i","a","S"
				                 .collect(Collectors.joining()); // "ias"
		
		System.out.println(output);
		

		List<String> words = Arrays.asList("Sai", "mohan", "lakshman");

		List<String> reversedWords = words.stream().map(word -> IntStream.range(0, word.length())
				                                                .mapToObj(i -> word.charAt(word.length() - 1 - i))
				                                                .map(String::valueOf)
				                                                .collect(Collectors.joining()))
				                                                .collect(Collectors.toList());

		System.out.println(reversedWords);

	}
}
