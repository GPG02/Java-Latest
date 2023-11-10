package day31;
class A
{
	private void m1()//not inherited hence we cant override
	{
		System.out.println("m1");
	}
	
	final void m2()//inherited but we cant override
	{
		System.out.println("m2");
	}
}

class B extends A
{
	
}
public class Demo2 {

	public static void main(String[] args) {
		
		B b1=new B();
		b1.m2();

	}

}
