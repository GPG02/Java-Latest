package day32;
class A
{
	void m1()
	{
		System.out.println("M1 present only in parent");
	}
	
	void m2()
	{
		System.out.println("M2 present in parent");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("M2 present in child");
	}
	
	void m3()
	{
		System.out.println("M3 present only in child");
	}
}
public class Demo1 {

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.m1();//parent
		b1.m2();//child
		b1.m3();//child
		
//		A a1=(A)b1;
		
//		A a1=(A)new B();
		
		A a1=new B(); //Auto up-casting
		a1.m1();//parent
		a1.m2();//child
//		a1.m3()// we cant call this
		
//		A a2=new A();
//		B b2=(B)a2;//converting parent object to child type
		
		B b2=(B)a1;//converting up-casted object back to child type
		b2.m1();
		b2.m2();
		b2.m3();
		
	}

}
