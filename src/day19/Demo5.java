package day19;

public class Demo5 {

//	public static int m1(int n)
//	{
//		if(n>0)
//		{
//			int sum=n+m1(n-1);
//			return sum;
//		}
//		else
//		{
//			return 0;
//		}
//	}
	
	public static int sum(int n)
	{
		if(n>0)
		{
			return n+sum(n-1);
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(3));
	}

}
