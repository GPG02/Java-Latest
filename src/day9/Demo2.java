package day9;

import java.util.Scanner;

public class Demo2 {
//check if given number is +ve or not
	public static void main(String[] args) {
		//accept a number from user 
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter i value:");
		int i=sc.nextInt();
		sc.close();
		
		// check if number is > 0 then print number is +ve
		if(i>0)
		{
			System.out.println(i+" is +ve");
			
		}
		else
		{
			System.out.println(i+" is not +ve");
		}
		

	}

}
