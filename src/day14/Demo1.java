package day14;

public class Demo1 {

	public static void main(String[] args) {
		int n=1;
		String msg="It is a Prime Number";
		
		if(n==1)
		{
			msg="It is NOT a Prime Number";
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					msg="It is NOT a Prime Number";
					break;
				}
			}
		}
		System.out.println(msg);
	}

}
