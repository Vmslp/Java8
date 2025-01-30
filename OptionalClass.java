import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		
		String str1 = "mohan";
		Optional<String> optinal = Optional.ofNullable(str1);
		if (optinal.isPresent()) {
			System.out.println("value is present:" + optinal.get());
		} else {
			System.out.println("value is not present");
		}

		
		
		String str2 = "mohan";
		Optional<String> optional = Optional.ofNullable(str2);
		String result = optional.isPresent() ? "value is present: " + optional.get() : "value is not present";
		System.out.println(result);

		
		
		String input = null;
		String resultt = Optional.ofNullable(input)
				.filter(s -> !s.isEmpty())
				.orElse("Default");
		System.out.println(resultt);

		
		
		String str4 = "";
		Optional<String> opt = Optional.ofNullable(str4);
		if (opt.isPresent()) {
			System.out.println("value is present");
		} else {
			System.out.println("value is not present");
		}
	}
}
