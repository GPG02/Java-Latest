package day26;
class C
{
	int i=10;
	static int j=20;
	
	public void m1()//non-static method
	{
		System.out.println(i);//access non-static variable from non-static method
		System.out.println(j);//access static variable from non-static method
		
		//use below code if there is a local variable with same name
		System.out.println(this.i);
		System.out.println(C.j);
	}
}
public class Demo4 {

	public static void main(String[] args) {
		C c1=new C();
		c1.m1();

	}

}
