package day45;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo6 {

	public static void main(String[] args) {
		ArrayList<String> breakFast=new ArrayList<String>();
		breakFast.add("Idly");
		breakFast.add("Dose");
		breakFast.add("Vade");
		breakFast.add("Poori");
		breakFast.add("Pongal");
		breakFast.add("Dose");
		breakFast.add("Dose");
		breakFast.add("Idly");
		
		LinkedHashMap<String, Integer> food=new LinkedHashMap<String, Integer>();
		
		for(String item:breakFast)
		{
			if(food.containsKey(item))
			{
				Integer value = food.get(item);
				value++;
				food.put(item, value);
			}
			else
			{
				food.put(item, 1);
			}
		}
		
		//print the items present in arraylist without repeating it
		Set<String> allItems = food.keySet();
		System.out.println(allItems);
		
		//print only duplicate items present in array list
		System.out.println("Duplicate items ");
		for(String item:allItems)
		{
			Integer value = food.get(item);
			if(value>1)
			{
				System.out.println(item);
			}
		}
		
		//print only unique items present in array list
				System.out.println("Unique items ");
				for(String item:allItems)
				{
					Integer value = food.get(item);
					if(value==1)
					{
						System.out.println(item);
					}
				}
		//print items present in Array List along with its occurance
				System.out.println(food);
	}

}
