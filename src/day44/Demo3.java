package day44;

import java.util.PriorityQueue;

public class Demo3 {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		
		q.offer("Bhanu");
		q.offer("Bhanu");
		q.offer("Akash");
		q.offer("Ambika");
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());

	}

}
