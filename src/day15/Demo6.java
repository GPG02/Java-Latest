package day15;

public class Demo6 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		System.out.println(a.length);//print size of the array
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);

//		for(int i=0;i<=4;i++)
//		{
//			System.out.println(i);
//		}
		int size=a.length;
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);//print 1st to last element
		}
		
		System.out.println("------");
		
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(a[i]);//print  last to 1st element
		}
		
		System.out.println("------");
		for(int i=0;i<size;i=i+2)
		{
			System.out.println(a[i]);//print 1st to last alternative element
		}
		
	}

}
