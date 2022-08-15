package demo.oops;
/*
 * Class Dog 
 * Attributes : breed, color, age, size
 * Behaviors : eat, sleep, bark, run, do tricks
 */
public class ClassAndObjectEx {
public static void main(String[] args) {
//	in stack / reference
	Dog chowchowDog = new Dog();
	chowchowDog.breed = "Chow Chow";
	chowchowDog.age = 5;
	chowchowDog.color = "golden brown";
	chowchowDog.size = 'M';
	System.err.println(chowchowDog.breed + "\t" + chowchowDog.age + "\t" + chowchowDog.color + "\t" + chowchowDog.size );
	chowchowDog.runFast();
	chowchowDog.eat();
	chowchowDog.sleeps();
	chowchowDog.tricks();
	
	//create the other two dogs....
}
}
 class Dog {
//	 fields, attributes, variables
	 String breed;
	 String color;
	 char size;
	 byte age;
//	 methods, functions, behaviors
	 public void runFast() {
		 System.err.println(breed + " runs and chases the thief");
	 }
	 public void eat() {
		 System.err.println(breed + " eats meat and eggs");
	 }
	 public void bark() {
		 System.err.println(breed + " barks bow wow");
	 }
	 public void tricks() {
		 System.err.println(breed + " tricks for the owner");
	 }
	 public void sleeps() {
		 System.err.println(breed + " sleeps silently in a corner of the room");
	 }
	 
 }