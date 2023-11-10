package day17;

public class Demo2 {
//jagged array
	public static void main(String[] args) {
		int[][] a= {{10,20},{30,40,50},{60}};

//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		
//		System.out.println(a[1][0]);
//		System.out.println(a[1][1]);
//		System.out.println(a[1][2]);
//		
//		System.out.println(a[2][0]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
