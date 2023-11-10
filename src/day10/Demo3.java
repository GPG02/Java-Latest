package day10;

import java.util.Scanner;

public class Demo3 {
//check if the person is eligible for marriage 

	public static void main(String[] args) {
		//ask gender and age
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz select the gender: 1-Female 2 -Male");
		int gender=sc.nextInt();
		System.out.println("Plz enter the Age");
		int age=sc.nextInt();
		sc.close();
		
		if((gender==1 && age>=18) || (gender==2 && age>=21))
		{
			System.out.println("yes u can");
		}
		
		else
		{
			System.out.println("sorry");
		}
		

	}

}
