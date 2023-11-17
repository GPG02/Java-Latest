package day40;

public class Demo5 {

	public static void main(String[] args) {
		String url="http://aksharatraining.com";
		System.out.println(url.startsWith("http"));
		System.out.println(url.startsWith("https"));
		
		System.out.println(url.endsWith("com"));
		System.out.println(url.endsWith("org"));
		
		System.out.println(url.contains("akshara"));
		System.out.println(url.contains("Akshara"));
		System.out.println(url.contains("bhanu"));
		

		System.out.println(url.contains("Akshara".toLowerCase()));
		
		String url2="http://aksharatraining.com";
		System.out.println(url.equals(url2));//true
		System.out.println(url.compareTo(url2));//0
		
		String url3="http://AksharaTraining.com";
		System.out.println(url.equals(url3));//false
		System.out.println(url.equalsIgnoreCase(url3));//false
	}

}
