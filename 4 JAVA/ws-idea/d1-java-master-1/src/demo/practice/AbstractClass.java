package demo.practice;

public class AbstractClass {
    public static void main(String[] args) {
//        'Abs' is abstract; cannot be instantiated
//        Abs obj = new Abs();
    }
}
abstract class Abs {

}

class Demo {
    // cannot have abstract method inside a non-abstract class
//    abstract void test();

}
abstract class Demo1 {
    // abstract method can be created inside abstract class
//    abstract method should end with ;
//    we cannot have body {} for an abstract method
    abstract void test();

}