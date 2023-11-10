package day35;
class A3{
}

class B3 extends A3{
	
}

interface A4{
	
}

interface B4 extends A4
{
	
}

interface A5{
	
}
class B5 implements A5{
	
}
public class Demo3 {

	public static void main(String[] args) {
		//parent of a class can be interface or class
		//parent of an interface must be another interface only
		
		//class -> class  and interface to interface -->extends
		//interface -> class implements
		//class --XXXX--> interface not allowed
		B5 b5=new B5();
		b5.toString();
		
	}
}
