package day21;

class A
{
	//inside a class we can declare any variable (primitive or non primitive)
	int i=10;
}

public class Demo3 
{

	public static void main(String[] args)
	{
	
		A a1=new A();
		A a2=a1;
		A a3=new A();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//access operator - used to access member of the class/obejct
		a1.i=20;
		int v = a1.i;
		System.out.println(v);//20
		
		System.out.println(a2.i);//10
		
		System.out.println(a3.i);//10
		

	}

}
