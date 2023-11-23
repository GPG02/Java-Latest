package day44;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		
		//join/enter the q
		q.offer("A");
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer(null);
		q.offer(null);
		System.out.println(q);
		
		//who is the front of the q
		System.out.println(q.peek());//A
		
		System.out.println(q.poll());//A exit the q
		
		System.out.println(q);//B C
		
		System.out.println(q.poll());//B
		
		System.out.println(q);// C
		
		System.out.println(q.poll());//C
		
		System.out.println(q);// []
		
		System.out.println(q.poll());//we dont get any exception but returns null

	}

}
