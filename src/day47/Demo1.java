package day47;

public class Demo1 {
	static String s="abcd";
	static int i=0;
	
	public static void main(String[] args) {
	
		System.out.println("Main Starts");
		try 
		{
			m1();
		}
		catch (NullPointerException e)
		{
			System.out.println("String is not initialized");
		}
		catch (ArithmeticException e)
		{
			System.out.println("i cant divide");
		}
		catch (Exception e) { //should be last catch block
			System.out.println("common solution");
		}
		System.out.println("Main Ends");
		
	}
	
	
	public static void m1()
	{
		System.out.println(s.length());
		System.out.println(100/i);
	}

}
