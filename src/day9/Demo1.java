package day9;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter i value:");
		int i=sc.nextInt();
		System.out.println("Plz enter j value:");
		int j=sc.nextInt();
		sc.close();
		
		if(i<=j)
		{
			System.out.println("i is less than j");
		}
		else
		{
			System.out.println("i is NOT less than j");
		}
		
		System.out.println("Main Ends");
	}

}
