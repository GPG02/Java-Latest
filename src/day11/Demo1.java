package day11;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("Main Starts");

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Plz enter a number from 1 or 2");
//		int option=sc.nextInt();
//		sc.close();
		char option=10;
		switch (option) 
		{
			default:
					System.out.println("Case default");
					break;
			case 2:
					System.out.println("Case 2 body");
					break;
				
			case 3:
					System.out.println("Case 1 body");
					break;//exit the switch block
			
		}

		if(option==1)
		{
			System.out.println("Case 1 body");
		}
		else if(option==2)
		{
			System.out.println("Case 2 body");
		}
		else
		{
			System.out.println("Case default");
		}
		System.out.println("Main Ends");
	}

}
