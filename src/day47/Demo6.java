package day47;

public class Demo6 {
	static String msg;
	public static void main(String[] args) {
		
		
		try
		{
			System.out.println(100/0);
		}
		catch (Exception e)
		{
			System.out.println("I got exception");
			System.out.println(msg.length());
		}
		finally {
			System.out.println("The end");
		}
		
		Object k;
	}

}
