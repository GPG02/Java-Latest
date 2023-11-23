package day44;

import java.util.LinkedHashSet;

public class Demo7 {

	public static void main(String[] args) {
		LinkedHashSet<String> s=new LinkedHashSet<String>();
		s.add("Apple");
		s.add("Apple");
		s.add("apple");
		s.add("Mango");
		s.add("Chiku");
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		System.out.println(s.size());
		
		
		for(String v:s)
		{
			System.out.println(v);
		}
	}

}
