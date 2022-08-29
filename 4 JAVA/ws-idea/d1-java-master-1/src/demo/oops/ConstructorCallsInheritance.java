package demo.oops;

public class ConstructorCallsInheritance {
    public static void main(String[] args) {
        Product5 product5Obj = new Product5(100);
    }
}

class Product5 {
//    DEFAULT CONSTRUCTOR
    Product5() {
        System.out.println("Base Default Cons");
    }
//    PARAMETERIZED CONSTRUCTOR
    Product5(int num) {
        System.out.println("Base Parameterized Cons");
    }
}
