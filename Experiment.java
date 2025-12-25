import java.util.*;

public class Experiment{
	public static void main(String[] args){
		System.out.println("Hi, I am here!");
		Scanner sc = new Scanner(System.in);
			
		Animal obj = new Animal("Cat", 5);
		Animal animal = new Dog();
		animal.sound();
	}
}

class Animal{
	String species;
	int age;

	public Animal(){}

	public Animal(String species, int age){
		this.species = species;
		this.age = age;
	}
	public void sound(){
                System.out.println("Animals make sound.");
        }
}	

class Dog extends Animal{
	@Override
	public void sound(){
		System.out.println("Dog bark");
	}
}
