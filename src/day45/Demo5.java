package day45;

import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> items=new LinkedHashMap<String, Integer>();
		items.put("Chair", 100);
		items.put("Table", 2);
		items.put("Table", 3);
		items.put("Marker", 25);
		items.put("marker", 28);
		items.put("projector",null);
		
		Set<String> allKeys = items.keySet();
		for(String key:allKeys)
		{
			
			Integer value = items.get(key);
			
			System.out.println(key+"-->"+value);
		}
		
	}

}
