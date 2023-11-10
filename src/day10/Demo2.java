package day10;

import java.util.Scanner;

public class Demo2 {
//check if the person is eligible for marriage 

	public static void main(String[] args) {
		//ask gender and age
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz select the gender: 1-Female 2 -Male");
		int gender=sc.nextInt();
	
		
		if(gender==1)
		{
			System.out.println("Plz enter the Age");
			int age=sc.nextInt();
			sc.close();
			if(age>=18)
			{
				System.out.println("Lady ,Yes u can marry");
			}
			else
			{
				System.out.println("Lady,No u can't marry");
			}
		}
		else if(gender==2)
		{
			System.out.println("Plz enter the Age");
			int age=sc.nextInt();
			sc.close();
			if(age>=21)
			{
				System.out.println("Bro,Yes u can marry");
			}
			else
			{
				System.out.println("Kid, wait...");
			}
		}
		else
		{
			System.out.println("invalid gender input");
		}
		

	}

}
