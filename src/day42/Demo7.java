package day42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//searching & sorting
public class Demo7 {
//accept city names from user and store it in list
//ask for the city to search and print the result
	public static void main(String[] args) {
		
		System.out.println("Please enter the number city");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> allCity=new ArrayList<String>();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Please enter city name:");
			String cityName=sc.next();
			allCity.add(cityName);
		}
		System.out.println("List of city:"+allCity);
		
		System.out.println("Please enter cityname to search:");
		String cityToSearch=sc.next();
		if(allCity.contains(cityToSearch)) {
			System.out.println("yes, city is present in the list");
		}
		else
		{
			System.out.println("Sorry, city is NOT present in the list");
		}
		sc.close();
		
	}

}
