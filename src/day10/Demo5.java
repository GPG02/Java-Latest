package day10;

import java.util.Scanner;

public class Demo5 {
//check whether person can vote
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter the Age");
		int age=sc.nextInt();
		sc.close();
		
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You can't vote");
		}
	}
}
