package day26;

//count the number of objects created

class A
{
	static int objCount=0;
	
	A()
	{
		objCount++;
		System.out.println("Number of object created till now is:"+objCount);
	}
}


public class Demo2 {

	public static void main(String[] args) {
		A a1=new A();
		
		A a2=new A();
		
		A a3=new A();
		
	}

}
