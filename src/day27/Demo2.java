package day27;

class A
{
	
	static int i=10;
	
	static
	{
		
		System.out.println("Static block 1");
	}
	
	static
	{
		System.out.println("Static block 2");
	}
	
	static
	{
		System.out.println("Static block 3");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(A.i);
		System.out.println("Hi");
		A a1=new A();
		A a2=new A();
		System.out.println("main end");
	}

}
