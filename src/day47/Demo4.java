package day47;

public class Demo4 {
	public static String s="a";
	public static void main(String[] args) {
		
		try 
		{
			System.out.println(s.length());
			
					try 
					{
						System.out.println(100/0);
						
					}
					catch (ArithmeticException e) 
					{
						System.out.println("Hi");
					}

		}
		catch (NullPointerException e) {
			System.out.println("Bye");
		}
	
	}

}
