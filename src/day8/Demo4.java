package day8;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("Hi plz enter a number");
		Scanner sc=new Scanner(System.in);//creating Scanner class object
		int v = sc.nextInt();
		System.out.println("Hi the number is:"+v);
		sc.close();

	}

}
