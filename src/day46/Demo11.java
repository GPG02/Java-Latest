package day46;

public class Demo11 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		try
		{
			m1();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main ends");
	}
	
	public static void m1() throws InterruptedException
	{
		System.out.println("m1 starts");
		Thread.sleep(2000);
		System.out.println("Hi");
		Thread.sleep(2000);
		System.out.println("m1 ends");
	}

}
