package day23;

class Emp
{
	
}
class A
{
	int i=10;
	String s="bhanu";
	int[] a= {10,20};
	Emp e1=new Emp();
	
}
public class Demo1 
{
	static int i=10;
	
	public static void main(String[] args) 
	{
		int j=20;
		System.out.println(i);
		System.out.println(j);
		
		{
			int k=10;
			System.out.println(k);
		}
		
//		System.out.println(k);
		
		for(int p=0;p<10;p++)
		{
			System.out.println(p);
		}
//		System.out.println(p);
	}

	public static void m1()
	{
		System.out.println(i);
//		System.out.println(j);
	}
	
	public static void m2()
	{
		System.out.println(i);
//		System.out.println(j);
	}
}
