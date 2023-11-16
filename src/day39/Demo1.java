package day39;
class A
{
	
}
public class Demo1 {
	
	 public static String myString(Object obj)
	 {
	        return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
	    }
	 
	public static void main(String[] args) {
		
		String s1="Bhanu";
		String s2="Bhanu";
		String s3="Bhanu";
		System.out.println(s1);
 
		A a1=new A();
		System.out.println(a1.toString());
		System.out.println(Demo1.myString(a1));
		System.out.println(Demo1.myString(s1));
		System.out.println(Demo1.myString(s2));
		System.out.println(Demo1.myString(s3));
	}

}
