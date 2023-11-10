package day8;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Hi please enter ur name");
		Scanner sc=new Scanner(System.in);//creating Scanner class object
		String v = sc.next();
		System.out.println("Hi "+v+" Good Morning ");
		sc.close();

	}

}
