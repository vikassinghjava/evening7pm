import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class TestStream {
 public static void main(String[] args) {
	 	
	 Map<String, Integer> map = new LinkedHashMap<String, Integer>();

     map.put("Zero", 0);
     map.put("One", 1);
     map.put("Two", 2);
     map.put("Three", 3);
     map.put("Four", 4);

     // Obtain the entry with the minimum value:
     Entry<String, Integer> entryWithMinValue = Collections.min(
         map.entrySet(), Entry.comparingByValue());
     System.out.println(entryWithMinValue);

     // Or directly obtain the key, if you only need that:
     String keyWithMinValue = Collections.min(map.entrySet(), Entry.comparingByValue()).getKey();
     System.out.println(keyWithMinValue);
 }

}
