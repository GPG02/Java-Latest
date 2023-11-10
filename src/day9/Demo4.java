package day9;

import java.util.Scanner;

public class Demo4 {
//accept a number from user and check if it is even/odd number
// hint n%2==0
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number:");
		int n=sc.nextInt();
		sc.close();
		
		if(n%2==0)
		
			System.out.println(n+" is even number");
			
		else
		
			System.out.println(n+" is odd number");
		
		
	}

}
