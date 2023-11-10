package day26;
class F
{
	public static void m1()
	{
		System.out.println("static method m1 of E");
	}
	
	public void m2()
	{
		System.out.println("non-static method m2 of E");
	}
	
	public  void myMethod()
	{
		F.m1();
		m1();
		
		this.m2();
		m2();
	}
}
public class Demo7 {

	public static void main(String[] args) {
		
		F f1=new F();
		f1.myMethod();
		
	}

}
