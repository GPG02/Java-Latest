package day27;

class C
{
	static int i=10;
	int j=20;
	{
		
		System.out.println("Non-static block1");
		System.out.println(this.j);
	}
	
	C()
	{
		System.out.println("UDC");
		
	}
	
	{
		System.out.println("Non-static block2");
	}
	
	{
		System.out.println("Non-static block3");
	}
}

public class Demo5 {

	public static void main(String[] args) {

		System.out.println("Main starts");

		System.out.println(C.i);
		
		C c1=new C();
		System.out.println(c1.j);
		
		C c2=new C();
		
		C c3=new C();
		
		System.out.println("Main ends");
	}

}
