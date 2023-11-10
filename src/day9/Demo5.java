package day9;

import java.util.Scanner;

public class Demo5 {
//accept a number from user and check if it is even/odd number
// hint n%2==0
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number:");
		int n=sc.nextInt();
		sc.close();
		System.out.println(n%2==0?n+" is even number":n+" is odd number");
		
		
	}

}
