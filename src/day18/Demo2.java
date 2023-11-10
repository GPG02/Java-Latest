package day18;

public class Demo2 {

	public static String m1(int i)
	{
		if(i>0)
		{
			return "hi";
			
		}
		else
		{
			return "Bye";
		}
	}
	public static void main(String[] args) {
		
		String v = Demo2.m1(1);
		System.out.println(v);//hi
		
		System.out.println(Demo2.m1(0));//bye
	}

}
