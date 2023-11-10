package day24;

public class Demo1 {
	static final int a = 10;
	final int b = 10;

	static int c = 10;
	int d = 10;

	static final String e = "abcd";
	final String f = "abc";

	static String g = "abc";
	String h = "Abc";
		 
	public static void main(String[] args) {
		final int i = 10;
		 int j = 10;
		 
		final String k = "abcd";
		String l = "abc";

		//accessing these variables - we should check if they are static or non-static
		//static variables are accessed using class name
		//non static variables are accessed using object
		Demo1 obj1=new Demo1();
		System.out.println(Demo1.a);
		System.out.println(obj1.b);
		System.out.println(Demo1.c);
		System.out.println(obj1.d);
		System.out.println(Demo1.e);
		System.out.println(obj1.f);
		System.out.println(Demo1.g);
		System.out.println(obj1.h);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
