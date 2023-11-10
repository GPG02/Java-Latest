package day27;

class P
{
	int i=10;
	static int j=20;
	
	void m1()
	{
		System.out.println("m1");
	}
	
	static void m2()
	{
		System.out.println("m2");
	}
}

class Q extends P
{
	
}
public class Demo10 {

	public static void main(String[] args) {
		P p1=new P();
		
		System.out.println(p1.i);
		System.out.println(P.j);
		
		p1.m1();
		
		P.m2();

		Q q1=new Q();
		
		System.out.println(q1.i);
		System.out.println(Q.j);
		
		q1.m1();
		Q.m2();
		
	}

}
