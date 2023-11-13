package day37;

interface A
{
	void m1();
}

class B implements A
{
	public void m1()
	{
		System.out.println("m1 of B");
	}
}

abstract class C implements A
{
	//we can have any type of variables
	int i=10;
	
	//we can have any type of methods
	
	void test() {
		
	}
	//constructor SIB & IIB...
	public C()
	{
		
	}
	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	//we cant create object of abstract class
}

public class Demo1 {

	public static void main(String[] args) {
	 
		B b1=new B();
		b1.m1();
		
		C c1;
//		c1=new C();

	}

}
