package day38;

public class Demo3 {

	public static void main(String[] args) {

		Integer a=Integer.valueOf(10);//boxing
		Integer b=10;//auto-boxing
		
		int c=a.intValue();//converting non-primitive to primitive - un-boxing
		int d=a;//auto un-boxing
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		if(a.equals(b))
		{
			System.out.println("compare object");
		}
		
		if(c==d)
		{
			System.out.println("compare value");
		}
	}

}
