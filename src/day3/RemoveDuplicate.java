package day3;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = {1, 1, 2, 3, 4, 1, 2, 5, 6, 1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;//in java we cant resize array-> 0 indicates element is removed
				}
			}
		
		}
		
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}
}
