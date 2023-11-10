package day7;

public class Demo4 {

	public static void main(String[] args) {
		char c='a';
		int i=c;//widening
		System.out.println(i);
//		i=i+1;
		i+=1;
		c=(char)i;//narrowing
		System.out.println(c);
		
		

	}

}
