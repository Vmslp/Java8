import java.util.Arrays;
import java.util.List;

public class LastElementInList {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ahgggqw","hawhx","uhdiuew","qtfdyt");
		
		String result = list.stream()
				            .skip(list.size()-1)
				            .findFirst()
				            .get();
		System.out.println(result);
		                
		                
	  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		              Integer resul = myList.stream()
		                                    .findFirst()
		                                    .get();
		              
		              System.out.println(resul);
		               
		              
	

	}
}
