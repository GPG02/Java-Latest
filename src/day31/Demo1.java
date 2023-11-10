package day31;

import java.util.Scanner;

final class Swamji
{
	final public int car=1;
	
	public void pravachana()
	{
		System.out.println("this world is nashwara");
	}
}


public class Demo1 {

	public static void main(String[] args) {
		Byte b;//wrapper classes
		Integer i;
		
		//let any one create A object and access i & m1
		//but it should be inherited
		Swamji s1=new Swamji();
//		s1.car=2;
		System.out.println(s1.car);
		s1.pravachana();
	}

}
