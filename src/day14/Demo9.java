package day14;

public class Demo9 {
	//print sum of the digits present in give number
	public static void main(String[] args) {
		int n=34567;
		int sum=0;
		while(n>0)
		{
			int l=n%10;
			sum=sum+l;
			n=n/10;
		}

		System.out.println(sum);
	}

}
