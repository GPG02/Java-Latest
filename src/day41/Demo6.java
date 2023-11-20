package day41;

import java.util.ArrayList;

//Iterable--> Collection-->List   Queue   Set
//List-->ArrayList
public class Demo6 {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add("Apple");
		a.add(123);
		a.add(true);
		
		System.out.println(a.size());
		System.out.println(a);
		a.add(10.56);
		
		
		//array- we cant resize
		Object[] b= {"Apple",123,true};
		System.out.println(b.length);
		System.out.println(b);
		
	}

}

