package day28;

class A4
{
	int i=1;
	
	void test()
	{
		System.out.println("test of A4");
	}
}

class B4 extends A4
{
	int i=10;
	
	void m1()
	{
		int i=20;
		System.out.println(i);//20
		System.out.println(this.i);//10
		System.out.println(super.i);//1
		this.test();//test of B4
		super.test();//test of A4
	}
	
	void test()
	{
		System.out.println("test of B4");
	}
	
}

public class Demo4 {

	public static void main(String[] args) {
		
		B4 b4=new B4();
		b4.m1();

	}

}
