package day16;

import java.util.Scanner;

public class Demo1 {
//searching
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number to search:");
		int n=sc.nextInt();
		sc.close();
		
		int[] a= {10,20,30};
		String msg="Not Found";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				msg="Found";
				break;
			}
		}
		
		System.out.println(msg);
	}
}
