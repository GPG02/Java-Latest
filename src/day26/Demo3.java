package day26;

//2 types of methods 
//a. static method-----> we call using class name and also using obj name (ref var)
//b. non-static method--> we call using obj name (ref var) only
class B
{
	
	//static method
	public static void m1()
	{
		System.out.println("M1 of B");
	}
	
	//non-static method
	public void m2()
	{
		System.out.println("M2 of B");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
		
		
		B b1=new B();
		
		B.m1();
		b1.m1();
		
		b1.m2();
		

	}

}
