package day14;

public class Demo7 {
	//print 1st 100 prime numbers
	public static void main(String[] args) {
		int count=1;
		int n=1;
		while(count<=100)
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
				System.out.println(count+")"+n);
				count++;
			}
			
			n++;
		}
	}
}
