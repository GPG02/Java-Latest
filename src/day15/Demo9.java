package day15;

import java.util.Scanner;

public class Demo9 {
	//ask user about number of inputs, create an array with the req size, then accept
	//the numbers , store them in array , print the sum of those array elements
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers you want to enter?");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("please enter the number");
			a[i]=sc.nextInt();//writing into array
		}
		sc.close();
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];//reading from array

		}
		
		System.out.println("Sum is:"+sum);
	}

}
