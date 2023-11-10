package day15;

import java.util.Scanner;

public class Demo8 {
	//take 3 numbers from user, store it in array 
	//print the sum 
	public static void main(String[] args) {
		int[] a=new int[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
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
