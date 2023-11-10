package day17;

public class Demo11 {
//create a method to print factorial of a given number
	
	public static void factorial(int n)
	{
		int fact=1;
		for(int i=n;i>=2;i--)
		{
			fact*=i;
			System.out.print(i+"x");
		}
		
		System.out.println("1="+fact);
	}
	public static void main(String[] args)
	{
	
		Demo11.factorial(5);

	}

}
