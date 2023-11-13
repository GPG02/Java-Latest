package day37;
interface P4
{
	default  void m1()
	{
		System.out.println("public non-static concrete method of P4 interface");
		m1a();
	}
	
	private void m1a()
	{
		System.out.println("private NS C mthod of P4 I");
	}
	
	static void m2()
	{
		System.out.println("public static concrete method");
		m2a();
	}
	
	private static void m2a()
	{
		System.out.println("private static concrete method");
	}
}
class C4 implements P4{
	
}
public class Demo7 {

	public static void main(String[] args) {
		P4 p4=new C4();
		p4.m1();
		
		P4.m2();

	}

}
