package day15;

public class Demo11 {
//print largest number present in the array
	public static void main(String[] args) 
	{
		int[] a= {90,10,30,7,3,23};
		int large=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(large<a[i])
			{
				large=a[i];
			}
		}
		
		System.out.println(large);

	}

}
