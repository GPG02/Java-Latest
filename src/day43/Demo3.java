package day43;

import java.util.LinkedList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<String> a=new LinkedList<String>();
		a.add("Apple");
		a.add("Mango");
		a.add("banana");
		System.out.println(a);
		
		a.add(1,"Chiku");
		System.out.println(a);
		a.set(1,"Sapota");
		System.out.println(a);
		a.remove(0);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
	}

}
