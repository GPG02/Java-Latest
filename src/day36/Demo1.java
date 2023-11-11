package day36;

interface Animal
{
	void makesSound();
	void eat();
}

class Dog implements Animal
{

	@Override
	public void makesSound() {
		System.out.println("Bow Bow");
		
	}

	@Override
	public void eat() {
		System.out.println("Pedigree");
		
	}
	
}

class Cat implements Animal
{

	@Override
	public void makesSound() {
		System.out.println("Meow");
		
	}

	@Override
	public void eat() {
		System.out.println("Close eyes and drink milk");
	}
	
}

class Test
{
	public static void testAnimal(Animal[] allAnimal)
	{
		for(Animal animal:allAnimal)
		{
			animal.makesSound();
			animal.eat();
		}
	}
}

public class Demo1 {
	
	public static void main(String[] args) {
		//call testAnimal method
		Animal[] a= {new Cat(),new Cat(),new Dog()};
		Test.testAnimal(a);
	}

}
