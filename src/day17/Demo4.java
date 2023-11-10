package day17;

public class Demo4 {

//in java we cant write method inside a method 	
	
	public static void m2()
	{
		System.out.println("Bye");
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Main starts");
		
		Demo4.m1();//calling the m1 method
		m1();
		m1();
		Demo4.m2();
		System.out.println("Main ends");
		
	
	}

	public static void m1()//head--declaration
	{
		//body-- implementation or definition
		System.out.println("m1 of Demo4");
	}

}
