package day44;

import java.util.ArrayDeque;

public class Demo2 {
	public static void main(String[] args) {
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.offerFirst("A");
		q.offerFirst("A");
		System.out.println(q);//A
		q.offerLast("B");
		System.out.println(q);//AB
		q.offerFirst("C");
		System.out.println(q);//CAB
		q.offerLast("D");
		System.out.println(q);//CABD
		q.pollFirst();
		System.out.println(q);//ABD
		q.pollLast();
		System.out.println(q);//AB
		q.pollFirst();
		System.out.println(q);//B
		q.pollLast();
		System.out.println(q);//[]
		
		
	}

}
