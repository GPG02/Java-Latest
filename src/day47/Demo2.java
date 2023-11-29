package day47;

public class Demo2 {
	static String s="abcd";
	static int i=0;
	
	public static void main(String[] args) {
	
		try 
		{
			m1();
		}
		catch (NullPointerException e)
		{
			System.out.println("Hi");
		}
		catch (ArithmeticException e)
		{
			System.out.println("TATA");
		}
		catch (Exception e)
		{ 
			System.out.println("Bye");
		}
		
		
		try 
		{
			m1();
		}
		catch (NullPointerException |ArithmeticException e)
		{
			System.out.println("Hi");
		}
		
		catch (Exception e)
		{ 
			System.out.println("Bye");
		}
		
		
	}
	
	
	public static void m1()
	{
		System.out.println(s.length());
		System.out.println(100/i);
	}

}
