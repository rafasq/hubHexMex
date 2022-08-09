package demo.oops;
/*
 * Class Dog 
 * Attributes : breed, color, age, size
 * Behaviors : eat, sleep, bark, run, do tricks
 */
public class ClassNObjectEx {
public static void main(String[] args) {
//	in stack / reference
	Dog dogReference = null;
// in heap / instance
	dogReference = new Dog();
	dogReference.breed = "Chow Chow";
	dogReference.age = 5;
	dogReference.color = "golden brown";
	dogReference.size = 'M';
	System.err.println(dogReference.breed + "\t" + dogReference.age + "\t" + dogReference.color + "\t" + dogReference.size );
	dogReference.runFast();
	dogReference.eat();
	dogReference.sleeps();
	dogReference.tricks();
	
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