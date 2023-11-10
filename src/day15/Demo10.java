package day15;

public class Demo10 {
//print smallest number present in the array
	public static void main(String[] args) 
	{
		int[] a= {90,10,30,7,3,23};
		int small=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		
		System.out.println(small);

	}

}
