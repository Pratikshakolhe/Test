package test;


class Animal {
	void shout()
	{
		System.out.println("shouting");
	}

	

}
class Dog extends Animal
{
	void shout()
	{
		System.out.println("Barking");
	}
	
}
class Horse extends Animal
{
	void shout()
	{
		System.out.println("Neigh");
	}
	
}



class Cat extends Animal
{
	void shout()
	{
		System.out.println("Meow");
	}
}



public class PolymerphismDemo {

	public static void main(String[] args) {
		Animal al1=new Animal();
		Animal al2=new Dog();
		Animal al3=new Horse();
		Animal al4=new Cat();
		al1.shout();
		al2.shout();
		al3.shout();
		al4.shout();
		

	}

}
