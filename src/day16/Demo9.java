package day16;

public class Demo9 {

	public static void main(String[] args) {
		String[][] s=new String[3][2];
		
		s[0][0]="A1";
		s[0][1]="Akash";
		
		s[1][0]="B1";
		s[1][1]="Bharath";
		
		s[2][0]="C1";
		s[2][1]="Chandana";
		
		for(String[] rows:s)
		{
			for(String cell:rows)
			{
				System.out.print(cell+" ");
			}
			System.out.println();
		}

	}

}
