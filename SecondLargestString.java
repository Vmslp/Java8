import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestString {

	public static void main(String[] args) {
		String str = "mohan sai lakshman"; //mohan
		String strObj = Arrays.stream(str.split(" "))
				              .sorted(Comparator.comparingInt(String::length).reversed())
				              .skip(1)
				              .findFirst()
				              .get();

		System.out.println(strObj);
                                                              // 5 
		Integer intObj = Arrays.stream(str.split(" "))
				               .map(w->w.length())
				               .sorted(Comparator.reverseOrder())
				               .skip(1)
				               .findFirst()
				               .get();
		
	System.out.println(intObj);
	
	}
}
