package day11;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Plz select the option: 1 2 3");
		int option = sc.nextInt();
		sc.close();

		switch (option) {
		default:
			System.out.println("Invalid Input");
			break;

		case 1:
			System.out.println("You have selected English");
			break;

		case 2:
			System.out.println("You have selected Hindi");
			break;

		case 3:
			System.out.println("You have selected Kannada");
			break;

		}

	}

}
