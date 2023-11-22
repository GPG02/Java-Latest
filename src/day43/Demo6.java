package day43;

import java.util.Stack;

public class Demo6 {

	public static void main(String[] args) {
		Stack<Emp> books=new Stack<Emp>();
		
		int i=1;
		while(true)
		{
			books.push(new Emp(1,"Dinga"));
			System.out.println(i++);
		}
	}

}
