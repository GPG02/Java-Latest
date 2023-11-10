package day17;

public class Demo3 {

	public static void main(String[] args) {
		int[][] a=new int[3][];
		a[0]=new int[2];
		a[0][0]=10;
		a[0][1]=20;
		
		a[1]=new int[3];
		a[1][0]=30;
		a[1][1]=40;
		a[1][2]=50;
		
		a[2]=new int[1];
		a[2][0]=60;
		
		System.out.println(a);
		System.out.println(a[0]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
