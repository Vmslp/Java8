import java.util.ArrayList;
import java.util.List;

public class LengthGreaterThan5 {

	 public static void main(String[] args) {
	 List<String> list = new ArrayList<String>();
	 list.add("Saket");
	 list.add("Saurav");
	 list.add("Softnghelp");
	 list.add("Steve");


	list.stream().filter(str -> str.length() > 5).forEach(System.out::println);

	 }
}
