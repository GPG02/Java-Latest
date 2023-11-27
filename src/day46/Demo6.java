package day46;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		m1();
		System.out.println("Main ends");
	}

	
	public static void m1()
	{
		System.out.println("m1 starts");
		m2();
		System.out.println("m1 ends");
	}
	
	public static void m2()
	{
		System.out.println("m2 starts");
		try {
				System.out.println(100/0);
		}
		catch (Exception e) {
			System.out.println("cant divide");
			e.printStackTrace();
		}
		System.out.println("m2 ends");
	}
	
	
	
}
