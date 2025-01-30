import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewQuestions {
	//filter(),map(),sorted(),distint(),flatmap(),skip()
	//collect(),forEach(),reduce(),count()
	
	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(4,5,7,3,2);
		Integer result1 = list1.stream()
				               .sorted(Comparator.reverseOrder())
				               .skip(1)
				               .findFirst()
				               .get();
	    System.out.println(result1);
	    
	    
	    //even numbers //remove duplicates //findfirst or find second highest numbers
	    List<Integer> list2 = List.of(4,4,2,8,3,9,6,6,5,7,0);
	           List<Integer> result = list2.stream()
	    		                     .filter(n->n%2==0)
	    		                     .distinct()
//	    		                     .sorted(Comparator.reverseOrder())
//	    		                     .skip(1)
//	    		                     .findFirst()
//	    		                     .get();
	    		                     .collect(Collectors.toList());
	    		                     
	    System.out.println(result);
	    
	    List<List<Integer>> list3 = List.of(List.of(1,2,3),List.of(4,5,6));
	    List<Integer> result3 = list3.stream()
	    		                     .flatMap(List::stream)
	    		                     .filter(n->n%2==0)
	    		                     .map(n->n*n)
	    		                     .collect(Collectors.toList());
	    System.out.println(result3);
	    
	    
	    
	    
	    String str = "mohan sai";
	    List<Character> resultt1 = str.chars()
	       .mapToObj(c->(char)c)
	       .collect(Collectors.groupingBy(c->c,Collectors.counting()))
	       .entrySet()
	       .stream()
	       .filter(c->c.getValue()==1)
	       .map(Map.Entry::getKey)
	       .collect(Collectors.toList());
	    System.out.println(resultt1);
//	    result1.forEach(System.out::println);     
	    
	    
	    
	    
	    
	    List<Integer> list5=Arrays.asList(2,7,6,1,8,9); //7,1,9=17
	  Integer collect = list5.stream()
	    		               .filter(n->n%2==1)
	    		               .distinct()
	    		               .reduce(Integer::sum)
	    		               .get();
	    System.out.println(collect);
	    
	    
	    
	   List<String> list7 = Arrays.asList("mohan","sai","lakshman");
	   List<String> reversedWords = list7.stream()
			                       .map(word -> IntStream.range(0, word.length())
                                           .mapToObj(i -> word.charAt(word.length() - 1 - i))
                                           .map(String::valueOf)
                                           .collect(Collectors.joining()))
                                           .collect(Collectors.toList());
	   System.out.println(reversedWords);
	    
	}
}
