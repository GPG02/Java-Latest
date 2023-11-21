package day42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Collection->interface    Collections-->class
public class Demo8 {
//print the list in sorted order
	public static void main(String[] args) {
		List<String> allCity=new ArrayList<String>();
		allCity.add("Bengaluru");
		allCity.add("Delhi");
		allCity.add("Chennai");
		allCity.add("Mumbai");
		allCity.add("Agra");
		
		System.out.println(allCity);
		Collections.sort(allCity);
		System.out.println(allCity);

	}

}
