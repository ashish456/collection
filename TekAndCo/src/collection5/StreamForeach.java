package collection5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamForeach {
	public static void main(String args[]) {
		List<String> alphabets = new ArrayList<>(Arrays.asList("aa", "bbb", "cac", "dog"));
		// looping over all elements using Iterable.forEach() method
		alphabets.forEach(s -> System.out.println(s));
		//forEach() method on Stream class
		alphabets.stream().forEach(System.out::println);
		// let's now only print elmements which startswith "a" 
		alphabets.stream() .filter(s -> s.startsWith("a")) .forEach(System.out::println);

		
	}

	
}
