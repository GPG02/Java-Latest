package day28;
class A
{
	static int i=10;
	int j=20;
}

class B extends A
{
	
}
public class Demo1 {

	public static void main(String[] args)
	{
		A a1=new A();
		A.i=100;
		System.out.println(A.i);
		System.out.println(a1.j);
		
		B b1=new B();
		System.out.println(B.i);
		System.out.println(b1.j);

	}

}
