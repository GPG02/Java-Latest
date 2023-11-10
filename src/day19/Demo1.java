package day19;

public class Demo1 {

	public static void m1(int i)
	{
		if(i<=0)
		{
			System.out.println("End");
		}
		else
		{
			System.out.println(i);
			i=i-1;
			m1(i);
		}
	}
	
	public static void main(String[] args) 
	{
		m1(10);
	}

}
