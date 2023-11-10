package day30;
class P
{
	void m1() {
		
		System.out.println("Hi");
	}
}

class C extends P
{
	void m1(int i)
	{
		System.out.println("Bye");
	}
}
public class Demo7 {

	public static void main(String[] args) {
		C c1=new C();
		c1.m1();
		c1.m1(10);
	}

}
