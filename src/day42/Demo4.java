package day42;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Mango");
		a.add("Banana");
		
		System.out.println(a.indexOf("Apple"));//0
		
		System.out.println(a.indexOf("Banana"));//2
		
		System.out.println(a.indexOf("Papaya"));//-1
		
		System.out.println(a.contains("Apple"));//true
		
		System.out.println(a.contains("Papaya"));//false
		
		System.out.println(a.contains("Man"));//false
		
		List<String> b=new ArrayList<String>(a);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.equals(b));
		
		List<String> c=new ArrayList<String>();
		c.add("Apple");
		c.add("Banana");
		c.add("Mango");
		
		System.out.println(a.equals(c));
		
	}

}
