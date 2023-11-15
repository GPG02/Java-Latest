package day38;

interface A
{
	default void m1()
	{
		System.out.println("Hi-m1 of A");
	}
}
interface B
{
	default void m1()
	{
		System.out.println("Bye-m1 of B");
	}
}


class C implements A,B
{

	@Override
	public void m1() {
		A.super.m1();
		B.super.m1();
		System.out.println("tata -m1 of C");
	}

	
}
public class Demo1 {

	public static void main(String[] args) {
	
		B c1=new C();
		c1.m1();

	}

}
