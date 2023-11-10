package day17;

public class Demo6 {

	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		m1();
		System.out.println("Main Ends");
		
	}

	public static void m1()
	{
		System.out.println("m1 Starts");
		m2();
		System.out.println("m1 Ends");
	}
	
	public static void m2()
	{
		System.out.println("m2 Starts");
		System.out.println("Hi");
		System.out.println("m2 Ends");
	}
}
