package day10;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//ask the user to enter 1,2,3
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz select the option: 1 2 3");
		int option=sc.nextInt();
		sc.close();
		//check if the input is 1--> print 'English'
		if(option==1)
		{
			System.out.println("You have selected English");
		}
		//check if the input is 2--> print 'Hindi'
		else if (option==2)
		{
			System.out.println("You have selected Hindi");
		}
		//check if the input is 3--> print 'Kannada'
		else if (option==3)
		{
			System.out.println("You have selected Kannada");
		}
		//none of the above--print 'Invalid input'
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
