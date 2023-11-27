package day46;

public class Demo4 {
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		int i=10;
		int j=0;
		try {
			int res=i/j;
			System.out.println(res);	
		}
		catch (Exception e) {
			System.out.println("Hi the msg is:"+e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("Main Ends");
	}

}
