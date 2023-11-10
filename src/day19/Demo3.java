package day19;

public class Demo3 {
	public static void myForLoop(int n)
	{
		if(n>=1)
		{
			int temp=n-1;
			myForLoop(temp);
			System.out.println(n);
		}
//		else
//		{
//			System.out.println("End");
//		}
			
		
		
	}
	public static void main(String[] args) {
		
		myForLoop(10);
		
	}

}
