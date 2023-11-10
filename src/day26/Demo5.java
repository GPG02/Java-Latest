package day26;
class D
{
	int i=10;
	static int j=20;
	
	static public void  m1()//static method
	{
		D d1=new D();
		System.out.println(d1.i);
//		System.out.println(this.i);
		System.out.println(j);
		System.out.println(D.j);
	}
}
public class Demo5 {

	public static void main(String[] args) {
	
		D.m1();

	}

}
