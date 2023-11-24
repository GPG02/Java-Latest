package day45;

import java.util.LinkedHashMap;

public class Demo3 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> items=new LinkedHashMap<String, Integer>();
		
		items.put("Chair", 100);
		items.put("Table", 2);
		items.put("Table", 3);
		items.put("Marker", 25);
		items.put("marker", 25);
		items.put("projector",null);
		items.put("AC", null);
		
		System.out.println(items.containsKey("Table"));//true
		System.out.println(items.containsKey("Fan"));//false
		
		System.out.println(items.containsValue(100));//true
		System.out.println(items.containsValue(null));//true
		System.out.println(items.containsValue(25));//true
		System.out.println(items.containsValue(7));//false
		System.out.println(items.containsValue("25"));//false
		
	}

}
