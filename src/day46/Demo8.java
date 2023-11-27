package day46;

public class Demo8 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			m1();
		}
		catch (Exception e)
		{
			System.out.println("cant divide");
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}

	
	public static void m1() throws ArithmeticException
	{
		System.out.println("m1 starts");
			m2();
		System.out.println("m1 ends");
	}
	
	public static void m2() throws ArithmeticException
	{
		System.out.println("m2 starts");
		System.out.println(100/0);
		System.out.println("m2 ends");
	}
	
	
	
}
