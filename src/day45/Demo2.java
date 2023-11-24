package day45;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) {
		HashMap<String, Integer> items=new HashMap<String, Integer>();
		System.out.println(items.size());//0
		items.put("Chair", 100);
		items.put("Table", 2);
		items.put("Table", 3);
		items.put("Marker", 25);
		items.put("marker", 25);
		items.put("projector",null);
		items.put("AC", null);
		items.put(null, 10);
		items.put(null, 100);
		System.out.println(items.size());//4
		System.out.println(items);//{C-100,T-2,M-25,m-25}
		
		LinkedHashMap<String, Integer> items2=new LinkedHashMap<String, Integer>();
		System.out.println(items2.size());//0
		items2.put("Chair", 100);
		items2.put("Table", 2);
		items2.put("Table", 3);
		items2.put("Marker", 25);
		items2.put("marker", 25);
		items2.put("projector",null);
		items2.put("AC", null);
		items2.put(null, 10);
		items2.put(null, 100);
		System.out.println(items2.size());//4
		System.out.println(items2);//{C-100,T-2,M-25,m-25}
		
		TreeMap<String, Integer> items3=new TreeMap<String, Integer>();
		System.out.println(items3.size());//0
		items3.put("Chair", 100);
		items3.put("Table", 2);
		items3.put("Table", 3);
		items3.put("Marker", 25);
		items3.put("marker", 25);
		items3.put("projector",null);
		items3.put("AC", null);
		items3.put(null, 10);
		System.out.println(items3.size());//4
		System.out.println(items3);//{C-100,M-25,T-2,m-25}
	}

}
