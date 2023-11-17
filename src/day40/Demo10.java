package day40;

public class Demo10 {
//i/p is bhanu prakash   o/p Bhanu Prakash
	public static void main(String[] args) {
	
		String s="bhanu";
		String[] a = s.split("");
		a[0]=a[0].toUpperCase();
		String s2=String.join("", a);
		System.out.println(s2);
		
	}

}
