package day14;

public class Demo5 {
//print prime number b/1 1 to 100
	public static void main(String[] args) {
		
		for(int n=1;n<=100;n++)
		{
			boolean prime=true;//true mean prime false means not a prime
			
			if(n==1)
			{
				prime=false;
			}
			else
			{
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						prime=false;
						break;
					}
				}
			}
			
			if(prime)
			{
				System.out.println(n);
			}
		}
	}
}
