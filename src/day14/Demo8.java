package day14;

public class Demo8 {
//print sum of the digits present in give number
//number is 234 , digits 2 ,3 & 4 , sum is 2+3+4=9
	public static void main(String[] args) {
		int n=234;
		
		int l=n%10;
		System.out.println(l);//7
		n=n/10;
		
		l=n%10;
		System.out.println(l);//4
		n=n/10;

		
		l=n%10;
		System.out.println(l);//3
		n=n/10;//2


	}

}
