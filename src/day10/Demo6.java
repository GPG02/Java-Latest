package day10;

import java.util.Scanner;

public class Demo6 {
//accept number and print day name; 1-Sunday........7-Saturday
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter any number from 1-7");
		int option=sc.nextInt();
		sc.close();
		if(option==1)
		{
			System.out.println("Sunday");
		}
		else if(option==2)
		{
			System.out.println("Monday");
		}
		else if(option==3)
		{
			System.out.println("Tuesday");
		}
		else if(option==4)
		{
			System.out.println("Wednesday");
		}
		else if(option==5)
		{
			System.out.println("Thursday");
		}
		else if(option==6)
		{
			System.out.println("Friday");
		}
		else if(option==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid Code");
		}
		
	}
}
