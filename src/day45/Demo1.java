package day45;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> items1=new ArrayList<Integer>();
		items1.add(3); // 3 projectors
		items1.add(100);// 100 chairs
		items1.add(25); //25 markers
		
//		System.out.println(items1.get(0));
//		System.out.println(items1.get(1));
//		System.out.println(items1.get(2));
		
		System.out.println(items1);
		
		HashMap<String, Integer> items2=new HashMap<String, Integer>();
		items2.put("Projector",3);
		items2.put("Chair",100);
		items2.put("Marker",25);
		
//		System.out.println(items2.get("Projector"));
//		System.out.println(items2.get("Chair"));
//		System.out.println(items2.get("Marker"));
		
		System.out.println(items2);
		

	}

}
