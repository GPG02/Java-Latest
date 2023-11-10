package day8;

import java.util.Scanner;

public class Demo5 {
//accept 2 numbers from the user , add it and print the sum
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//accept number 1
		System.out.println("Please enter number 1");
		int n1=sc.nextInt();
		
		//accept number 2
		System.out.println("Please enter number 2");
		int n2=sc.nextInt();
		
		//add them
		int sum=n1+n2;
		
		//print the result
		System.out.println("Sum is:"+sum);
		
		sc.close();
	}

}
