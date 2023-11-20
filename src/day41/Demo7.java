package day41;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();//up-casting & type safety
		a.add("Apple");
		a.add("Mango");
		a.add("Chiku");
		System.out.println(a.size());
		
		String v = a.get(0);
		System.out.println(v);
		
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		
		String v2 = a.get(1);
		System.out.println(v2);
		
		

	}

}
