package day22;

class A
{
	int i=20;
}

public class Demo1 {

	public static void main(String[] args) {
		
		A a1;
		a1=new A();

		A x=a1;
		int y=a1.i;

		
		System.out.println(x);//day22.A@w3f45g
		System.out.println(y);//20
		
		

	}

}
