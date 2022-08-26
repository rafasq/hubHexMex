package demo.oops;

public class BaseObjectToDerived {
    public static void main(String[] args) {
        A obj = new B();
        obj.methodA();
    }

}

class A {
    public void methodA() {
        System.out.println("methodA");
    }
}

class B extends  A{
   public  void methodA() {
        System.out.println("methodB");
    }
}