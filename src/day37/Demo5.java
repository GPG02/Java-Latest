package day37;

interface A1
{
	void m1();//public abstract method
	static void m2()//public static method JDK1.8
	{
		System.out.println("M2 of A1");
	}
	
	default void m3()//public non-static method JDK1.8
	{
		System.out.println("m3 of A1");
	}
}
class B1 implements A1
{
	public void m1()
	{
		System.out.println("m1 of B1");
	}
}
public class Demo5 {

	public static void testA(A1 a1)
	{
		a1.m1();
		A1.m2();
		a1.m3();
	}
	
	public static void main(String[] args) {
		A1 a1=new B1();
		Demo5.testA(a1);

	}

}
