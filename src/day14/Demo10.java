package day14;

public class Demo10 {
	//reverse the give number
	public static void main(String[] args) {
		int n=1235;
		while(n>0)
		{
			int l=n%10;
			System.out.print(l);
			n=n/10;
		}
		System.out.println();
		n=1235;
		String s="";
		while(n>0)
		{
			int l=n%10;
			s=s+l;
			n=n/10;
		}
		System.out.println(s);
		
		n=1235;
		int n2=0;
		while(n>0)
		{
			int l=n%10;
			n=n/10;
			n2=n2*10;
			n2=n2+l;
			
		}
		System.out.println(n2);
	}

}
