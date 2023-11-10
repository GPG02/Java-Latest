package day8;

import java.util.Scanner;

public class Demo7 {
//accept L & B of rectangle and calculate the area
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//accept length
		System.out.println("Please enter the length of the rectangle ");
		int l=sc.nextInt();
		//accept width
		System.out.println("Please enter the width of the rectangle ");
		int w=sc.nextInt();
		//calculate area
		int area=l*w;
		//print the result
		System.out.println("Area of the rectangle is:"+area);
		sc.close();
		
	}

}
