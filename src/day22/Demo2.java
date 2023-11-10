package day22;

class B
{
	//primitive->byte short int long float double boolean char 
	//non-primitive -->built in class & UD class & array (interface & Enum)
	byte a=1;
	short b=2;
	int c=3;
	long d=4;
	float e=5.0f;
	double f=6.0;
	boolean g=true;
	char h='a';
	
	String i="bhanu";
	A obj2=new A();
	int[] k= {10,20,30};
	
}
public class Demo2 {

	public static void main(String[] args) {
		//print all variables of B class here
		B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		System.out.println(obj.g);
		System.out.println(obj.h);
		
		System.out.println(obj.i);
		
		System.out.println(obj.obj2);//day22.A@a34Df
		System.out.println(obj.obj2.i);
		System.out.println(obj.k);//k= {10,20,30};
		System.out.println(obj.k[0]);
		
		
	}

}
