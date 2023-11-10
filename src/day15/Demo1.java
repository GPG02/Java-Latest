package day15;

import java.util.Scanner;

public class Demo1 {
//add number numbers given by user until user says stop
	public static void main(String[] args) {
		int stop;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("plz enter number1");
			int n1=sc.nextInt();
			
			System.out.println("plz enter number2");
			int n2=sc.nextInt();
			
			int sum=n1+n2;
			System.out.println("Sum is:"+sum);
			
			System.out.println("Do you want to stop?(1-yes 0-No)");
			stop=sc.nextInt();
		}while(stop==0);
		
		sc.close();
		
		System.out.println("Thank You");
	}

}
