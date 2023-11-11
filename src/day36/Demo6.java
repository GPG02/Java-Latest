package day36;

interface A//100% abstract 
{
	void m1();
	void m2();
}
abstract class B implements A //any
{
	public void m1()
	{
		
	}
}

class C extends B //100% concrete
{
	public void m2()
	{
		
	}
}
public class Demo6 {

	public static void main(String[] args) {
		
		C c1=new C();

	}

}
