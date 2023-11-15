package day10;

public class Pattern {

	public static void main(String[] args) {

		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i || i==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}

	}

}
