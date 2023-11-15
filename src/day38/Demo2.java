package day38;


public class Demo2 {
/*
 * byte-Byte
 * short ->Short
 * int --->Integer
 * long-->Long
 * float-->Float
 * double-->Double
 * char-->Character
 * boolean-->Boolean
 */
	public static void main(String[] args) {
		
		int i=10;
		String s=new String("Bhanu");
		String s2="Bhanu"; //auto boxing
//		Integer obj=new Integer(10);
		//converting primitive data type into non-primitive type--> boxing
		Integer obj=Integer.valueOf(10);
		Integer obj2=10;//auto boxing
		System.out.println(i);
		System.out.println(s);
		System.out.println(obj);
		
		Byte a;
		Short b;
		Long c;
		Float d;
		Double e;
		Character f;
		Boolean g;

	}

}
