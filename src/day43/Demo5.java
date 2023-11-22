package day43;

import java.util.Stack;

public class Demo5 {

	public static void main(String[] args) {
		Stack<String> books=new Stack<String>();
		
		books.push("Java");
		books.push("Python");
		books.push("SQL");
		System.out.println(books);
		System.out.println(books.peek());
		System.out.println("removing:"+books.pop());
		System.out.println(books);//[J P]
		System.out.println("removing:"+books.pop());
		System.out.println(books);//[J]
		System.out.println("removing:"+books.pop());
		System.out.println(books);//[]
//		books.pop();//EmptyStackException
		
		int i=1;
		while(true)
		{
			books.push("Java");
			System.out.println(i++);
		}
	}

}
