package day3;

public class VIshwa {

	public static void main(String[] args) {
		String s="Bhanu Prakash Akshara";
		String[] words = s.split(" ");
		String temp=words[0];
		words[0]=words[1];
		words[1]=temp;
		String result = String.join(" ",words);
		System.out.println(result);
		
		StringBuffer s2=new StringBuffer(result);
		System.out.println(s2.reverse());

	}

}
