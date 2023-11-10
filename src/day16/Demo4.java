package day16;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int[] a=new int[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("please enter the number");
			a[i]=sc.nextInt();//writing into array
		}
		
//		for(int v:a)
//		{
//			System.out.println("please enter the number");
//			a[v]=sc.nextInt();
//		}
		sc.close();
		
		

	}

}
