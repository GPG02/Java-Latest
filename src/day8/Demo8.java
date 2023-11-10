package day8;

import java.util.Scanner;

public class Demo8 {
//accept the input from user and calculate area of a circle
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//accept radius
		System.out.println("Please enter the radius of the Circle ");
		int r=sc.nextInt();
		//calculate area
		double area=Math.PI*r*r;
		//print the result
		System.out.println("Area of the Circle is:"+area);
		sc.close();

	}

}
