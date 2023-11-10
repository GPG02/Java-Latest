package day33;

class A
{
	public String m1()
	{
		String s="abc";
		return s;
	}
}


public class Demo1 {

	public static void main(String[] args) {
		
//		String s=new String("abc");//Creating String Object
//		int l = s.length();//calling non-static length method present in String class
//		System.out.println(l);
		
//		A a1=new A();
//		String s = a1.m1();//m1 is non-static method present in A class
//		int l = s.length();//length() is non-static method present in String class
//		System.out.println(l);
		//a.m1().m2().m3().m4().m5();
		A a1=new A();
		int l =  a1.m1().length();	//length method is present in the String object returned by m1 method	
		System.out.println(l);
	}

}
