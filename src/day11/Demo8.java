package day11;

public class Demo8 {

	public static void main(String[] args) {
		System.out.println("main starts");
		int c=1;
	
		
		for(;;)
		{
			
			System.out.println(c);
			c=c+10;
			
			if(c>100)
			{
				break;//exit from the for loop
			}
			
			System.out.println("after if");
		}

		System.out.println("main ends");
	}

}
