package day42;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("Apple");//add at the end
		a.add("Mango");
		a.add("Banana");
		a.add("Chiku");
		a.add("Grapes");
		a.add("Grapes");
		a.add(null);
		a.add(null);
		System.out.println(a.size());
		System.out.println(a);
		a.add(1, "Orange");//add at the specified index (insert)
		System.out.println(a);
		a.set(0,"Red Apple");//change/replace/edit 
		System.out.println(a);
		a.remove(0);//remove based on index
		System.out.println(a);
		a.remove("Orange");//remove based on object -1st occurance
		System.out.println(a.remove("Grapes"));
		System.out.println(a);
//		a.remove(-1);IndexOutOfBoundsException
		System.out.println(a.remove("papaya"));
		
	
		
	}

}
