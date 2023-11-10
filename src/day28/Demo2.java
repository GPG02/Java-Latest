package day28;

class A2
{
	A2(int i)
	{
		System.out.println("A2");
	}
}
//Implicit super constructor A2() is undefined for default constructor.
//Must define an explicit constructor
class B2 extends A2
{
	B2()
	{
		super(10);
		System.out.println("B2");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		
		B2 b2=new B2();

	}

}
