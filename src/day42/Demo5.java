package day42;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {

	public static boolean equalsIgnoreCase(List<String> a,List<String> b)
	{
		boolean same=true;
		
		if(a.size()!=b.size())
		{
			return false;
		}
		
		for(int i=0;i<a.size();i++)
		{
			String s1=a.get(i);
			String s2=b.get(i);
			if(!s1.equalsIgnoreCase(s2))
			{
				same=false;
				break;
			}
		}
		
		return same;
	}
	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Mango");
		a.add("Banana");
		
		List<String> b=new ArrayList<String>();
		b.add("Apple");
		b.add("Grapes");
		b.add("Banana");
		
		boolean result = equalsIgnoreCase(a,b);
		System.out.println(result);//false----->diff obj
		
		List<String> c=new ArrayList<String>();
		c.add("apple");
		c.add("mango");
		c.add("banana");
		
		result = equalsIgnoreCase(a,c);
		System.out.println(result);//true
		
		List<String> d=new ArrayList<String>();
		d.add("Apple");
		d.add("Mango");
		result = equalsIgnoreCase(a,d);
		System.out.println(result);//false--> number of obj are diff
		
		List<String> e=new ArrayList<String>();
		e.add("Banana");
		e.add("Apple");
		e.add("Mango");
		result = equalsIgnoreCase(a,e);
		System.out.println(result);//false --> order is diff
		
		
		
	}

}
