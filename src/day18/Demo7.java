package day18;
//create a method which returns sum and product of 2 given numbers

public class Demo7 {

	public static int[] m1(int a,int b)
	{
		int sum=a+b;
		int product=a*b;
		int[] result= {sum,product};
		return result;
	}
	public static void main(String[] args) {
		
		int[] res = Demo7.m1(10,5);
		System.out.println("Sum:"+ res[0]);
		System.out.println("Product:"+ res[1]);
	}

}
