package day14;

public class Demo6 {
//print the number b/w 1 to 100 along with its prime number status
	public static void main(String[] args) {
		
		for(int n=1;n<=100;n++)
		{
			String msg="is a Prime Number";
			
			if(n==1)
			{
				msg="is NOT a Prime Number";
			}
			else
			{
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						msg="is NOT a Prime Number";
						break;
					}
				}
			}
			System.out.println(n+" "+msg);
		}
	}
}
