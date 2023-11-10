package day31;

class Animal2
{
	void makeSound()//method present both in parent and child
	{
		System.out.println("Animal makes some sound");
	}
}

class Dog extends Animal2 
{
	@Override
	void makeSound()//method present both in parent and child
	{
		System.out.println("Dog makes some sound:Bow Bow");
	}
}
public class Demo7 {

	public static void main(String[] args) {
		Animal2 a=new Animal2();
		a.makeSound();//Animal makes some sound
		
		Dog d=new Dog();
		d.makeSound();//Dog makes some sound:Bow Bow
		
		Animal2 a2=(Animal2)d;//up-casting -converting dog(child) object to Animal(parent) type
		a2.makeSound();
	}

}
