package day44;

import java.util.HashSet;

public class Demo6 {

	public static void main(String[] args) {
		
		HashSet<String> s=new HashSet<String>();
		s.add("Apple");
		s.add("Apple");
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
