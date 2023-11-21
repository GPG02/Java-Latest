package day42;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Mango");
		a.add("Banana");
		
		List<String> b=new ArrayList<String>(a);
		
		System.out.println(b);
		
		List<String> c=new ArrayList<String>();
		c.add("Tomato");
		c.addAll(a);//add all the objects present in another list to this list
		
		System.out.println(c);
		
		List<String> d=new ArrayList<String>(c);
		
		c.removeAll(a);
		System.out.println(c);//['T']
		System.out.println(c.isEmpty());//false
		d.clear();
		
		System.out.println(d);//[]
		System.out.println(d.isEmpty());//true
		
	}

}
