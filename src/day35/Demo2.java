package day35;
interface A2
{
	void m1();//public abstract non-static non-final
	
	public abstract void m2();
	
}

class B2 implements A2 
{

	@Override
	public void m1() {
		
		System.out.println("m1 of B2");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 of B2");
		
	}
	
	public void m3()
	{
		System.out.println("m3 of B2");
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		B2 b2=new B2();
		b2.m1();
		b2.m2();
		b2.m3();
		
		A2 a2=new B2();
		a2.m1();
		a2.m2();

	}

}
