import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> flou = new HashMap<>();
		flou.put(2,"bbbb");
		flou.put(1,"aaaa");
		flou.put(3,"cccc");

		
		for( Map.Entry ent :flou.entrySet()) {
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}
		
		System.out.println();
		
		Set<Entry<Integer, String>> ent = flou.entrySet();
		for(Entry<Integer, String> result : ent ) {
			System.out.println(result.getKey() +" : "+result.getValue());
		}
		
	}
} 