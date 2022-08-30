package demo.practice;

public class Inheritanceex {
    public static void main(String[] args) {
//        static and base class object / base class method will be called
        Vehicle object = new Car();
        object.velocity();

        //        instance and base class object / derived class method will be called
    }
}

class Vehicle {
    public static void velocity() {
        System.out.println("vehicle velocity");
    }
}
class Car extends Vehicle {
//    static methods cannot be overriden
    public static void velocity() {
        System.out.println("car velocity");
    }
}