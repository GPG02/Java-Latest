package day20;

public class Demo4 {

	public static void m1()
	{
		System.out.println("Hi");
	}
	
	static int m1(int i)
	{
		System.out.println("Bye");
		return 0;
	}
	public static void main(String[] args) {
		
		m1(10);
		m1();

	}

}
