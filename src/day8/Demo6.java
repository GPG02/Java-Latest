package day8;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("Hi please enter a char");
		Scanner sc=new Scanner(System.in);//creating Scanner class object
//		sc.nextByte();
//		sc.nextShort();
//		sc.nextInt();
//		sc.nextLong();
//		sc.nextFloat();
//		sc.nextDouble();
//		sc.nextBoolean();
		char c = sc.next().charAt(0);
		
		System.out.println("Hi "+c+" Good Morning ");
		sc.close();

	}

}
