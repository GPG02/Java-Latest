package day18;

public class Demo5 {
//how to return multiple values from a method
	public static int[] m1(int a,int b)
	{
		int[] k=new int[2];
		k[0]=a;
		k[1]=b;
		
		return k;
		
	}
	
	public static void main(String[] args) {
	
		int[] v = Demo5.m1(10,20);
		System.out.println(v[0]);
		System.out.println(v[1]);

	}

}
