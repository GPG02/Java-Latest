package day32;
class Animal{
	void makeSound()
	{
		System.out.println("Animal makes sound");
	}
}

class Cat extends Animal{
	void makeSound()
	{
		System.out.println("Meow Meow");
	}
}

class Dog extends Animal{
	void makeSound()
	{
		System.out.println("Bow Bow");
	}
}

class Cow extends Animal{
	void makeSound()
	{
		System.out.println("Ambooo");
	}
}

class Land
{
	public static void testAnimal(Animal a)
	{
		a.makeSound();
	}
	
	public static void testAnimal(String s)
	{
		
	}
}

public class Demo4 
{

	public static void main(String[] args) 
	{	
		
		
		Animal[] allAnimals= {new Dog(),new Cat(),new Cat(),new Cow(),new Dog()};
		
		for(int i=0;i<allAnimals.length;i++)
		{
			Land.testAnimal(allAnimals[i]);
		}
		
		for(Animal animal:allAnimals)
		{
			Land.testAnimal(animal);
		}
		
	}

}
