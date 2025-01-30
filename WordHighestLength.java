import java.util.Arrays;
import java.util.Comparator;

public class WordHighestLength {
	
	public static void main(String[] args) {
		String str = "mohan sai lakshman";
		 String longestWord = Arrays.stream(str.split(" "))
		            .max(Comparator.comparingInt(String::length))
		            .orElse(null); 
		        
		        System.out.println(longestWord); 
	}
}
