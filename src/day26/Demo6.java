package day26;
class E
{
	public static void m1()
	{
		System.out.println("static method m1 of E");
	}
	
	public void m2()
	{
		System.out.println("non-static method m2 of E");
	}
	
	public static void myMethod()
	{
		E.m1();
		m1();
		
		E e1=new E();
		e1.m2();
//		e1.m1();
		
	}
}
public class Demo6 {

	public static void main(String[] args) {
		
		E.myMethod();
		
	}

}
