package day18;
//void--> this method will not return any value
public class Demo1 
{
	public static void m1()
	{
		System.out.println("m1");
		
		return; //empty return statement-- if the return type is void
	}
//int-- this method will return a value of type int
	public static int m2()
	{
		int i=100;
		return i;
	}
	
	public static void main(String[] args) 
	{
		Demo1.m1();
		
		Demo1.m2();//if method returns a value , receiving is not mandatory
		
		int k = Demo1.m2();
		System.out.println(k);
		
	}

}
