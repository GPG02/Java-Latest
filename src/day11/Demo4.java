package day11;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter any number from 1-7");
		int option=sc.nextInt();
		sc.close();
	
		switch (option) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Code");
			break;
		}
		

	}

}
