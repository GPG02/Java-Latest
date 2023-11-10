package day13;

public class Demo5 {

	public static void main(String[] args) {
		
		char n='A';
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
				
				if(n>'Z')
				{
					break;
				}
			}
			
			System.out.println();
		}

	}

}
