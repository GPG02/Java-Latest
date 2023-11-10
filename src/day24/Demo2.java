package day24;
class A
{
	
}

class B
{
	B()
	{
		System.out.println("Hi");
	}
}

class C
{
	C(int i)
	{
		System.out.println(i);
	}
}

class D
{
	void D()
	{
		System.out.println(100);
	}
}
public class Demo2 {

	public static void main(String[] args)
	{
		A a1=new A();//default constructor--> always no-arg constructor
		B b1=new B();//user defined constructor--> no arg constructor
		C c1=new C(10);//user defined constructor--> parameterized constructor
		D d1=new D();//default constructor-->
		d1.D();
	}

}
