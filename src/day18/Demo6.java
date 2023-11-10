package day18;

import java.util.Scanner;

//create a method which returns whether the given number is odd or even
public class Demo6 {

	public static String isOddOrEven(int number)
	{
		if(number%2==0)
		{
			return "The number "+number+" is Even";
		}
		else
		{
			return "The number "+number+" is Odd";
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Please enter a number:");
			int n=sc.nextInt();
			System.out.println(isOddOrEven(n));
		}
		
		sc.close();

	}

}
