package day18;
//Create a method which checks if the given number is prime or not
//prime number is a natural number which is completely divisible by exactly 2 numbers
public class Demo8 {

	public static String isPrimeNumber(int number)
	{
		String msg="It is a Prime Number";
		
		if(number>0)
		{
			if(number==1)
			{
				msg="Not a prime number";
			}
			else
			{
				for(int i=2;i<number;i++)
				{
					if(number%i==0)
					{
						msg="Not a prime number";
						break;
					}
				}
				
				
			}
		}
		else
		{
			msg="invalid input";
		}
		
		return number+"->"+msg;
	}
	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			System.out.println(isPrimeNumber(i));
		}
	}
}
