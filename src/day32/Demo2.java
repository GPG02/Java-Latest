package day32;
class Father
{
	void radio()
	{
		System.out.println("Old radio....");
	}
	
	void bike()
	{
		System.out.println("Old Bike....");
	}
}

class Son extends Father
{
	void bike()
	{
		System.out.println("New Bike....");
	}
	
	void car()
	{
		System.out.println("New Car....");
	}
}
public class Demo2 {

	public static void main(String[] args) {
//		Father f=new Father();
//		f.radio();//old
//		f.bike();//old
//		
//		Son s=new Son();
//		s.radio();//old
//		s.bike();//new
//		s.car();//new
		
		Father f2=new Son();//auto up-casting
		f2.radio();//old
		f2.bike();//new 
//		f2.car();//hidden from Father
		
		Son s2=(Son)f2;//explicit down-casting
		s2.radio();//old
		s2.bike();//new
		s2.car();//new 
		
		
		Son s1=(Son)new Father();//direct down-casting -not allowed in Java
		s1.radio();
		s1.bike();
		s1.car();

	}

}
