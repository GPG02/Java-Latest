package day31;

class Animal
{
	void makeSound()//method present only in parent
	{
		System.out.println("Animal makes some sound");
	}
}

class Cat extends Animal
{
	
}

public class Demo6 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.makeSound();
		
		Cat c1=new Cat();
		c1.makeSound();
		
		Animal a1=(Animal)c1;
		a1.makeSound();
	}

}
