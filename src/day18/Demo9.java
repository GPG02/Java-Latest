package day18;

public class Demo9 {

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
	//avoid multiple return statements 
	public static String m2(int i)
	{
		String s;
		if(i>0)
		{
			s="hi";
			
		}
		else
		{
			s="Bye";
		}
		
		
		return s;
	}
	public static void main(String[] args) {
		
		System.out.println(m1(0));
		System.out.println(m2(0));
		
	}

}
