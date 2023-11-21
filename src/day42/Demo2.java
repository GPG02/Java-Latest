package day42;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Mango");
		a.add("Banana");
		String v = a.get(0);
		System.out.println(v);
		System.out.println("----");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("----");
		for(String b:a)
		{
			System.out.println(b);
		}
		System.out.println("----");
		Object[] b = a.toArray();
		for(Object c:b)
		{
			System.out.println(c);
		}
	}

}
