package day28;
class A3
{
	A3()
	{
		this(10);
		System.out.println("A3()");
	}
	
	A3(int i)
	{
		System.out.println("A3(int)");
	}
}

class B3 extends A3
{
	B3()
	{
		this(7);
		System.out.println("B3()");
	}
	
	B3(int i)
	{
		super();
		System.out.println("B3(int)");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		B3 b3=new B3();

	}

}
