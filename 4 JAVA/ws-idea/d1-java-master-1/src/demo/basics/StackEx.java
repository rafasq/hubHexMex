package demo.basics;

public class StackEx {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main end");
    }

    public static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 end");
    }

    public static void m2() {
        System.out.println("m2 begin");
        System.out.println("m2 end");
    }
}
