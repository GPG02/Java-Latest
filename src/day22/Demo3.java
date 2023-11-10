package day22;

import java.util.Scanner;

public class Demo3
{
   // primitive-1
	 boolean b;
  //non-primitive built in class-1
	Scanner  sc=new Scanner(System.in);
//non-primitive Array-1
	String[] s= {"Abc","xyz"};
	
//non-primitive user defined-1
	Demo2 d=new Demo2();
	
	public static void main(String[] args)
	{
	
		
		//print here
		Demo3 obj=new Demo3();
		System.out.println(obj.b);
		
		System.out.println(obj.sc);
		System.out.println(obj.s);
		System.out.println(obj.s[0]);
		
		System.out.println(obj.d);
	}
}
