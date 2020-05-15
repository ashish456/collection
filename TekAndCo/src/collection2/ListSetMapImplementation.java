package collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMapImplementation {
	public static void main(String args[]) {
		List<String> lists= new ArrayList<String>();
		lists.add("Volvo");
		lists.add("Mercede");
		lists.add("BMW");
		
		Set<String> sets = new HashSet<>();
		sets.add("Volvo");
		sets.add("Mercede");
		sets.add("BMW");
		
		
		Map<String, String> maps =new HashMap<>();
		maps.put("Volvo", "1234");
		maps.put("Mercede", "567");
		maps.put("BMW", "897");
		
		
		System.out.println("List of cars are:");
		for(String list : lists) {
			System.out.println("Lists are "+""+list);
		}
		
		System.out.println("Sets of cars are:");
		for(String set : sets) {
			System.out.println("Sets are "+""+set);
		}
		
		System.out.println("Maps of cars are:");
		for(String map : maps.values()) {
			System.out.println("Lists are "+""+map);
		}
	
	}

}
