package demo.basics;

public class StaticNestedClassEx {
    public static void main(String[] args) {
        //create object of static nested class
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.test();
        OuterClass.StaticNestedClass.staticTest();
    }
}

class OuterClass {
    public String instanceFromOuterClass= "instanceFromOuterClass";
    public static String staticFromOuterClass= "staticFromOuterClass";
    static class StaticNestedClass {
        public  void test() {
//            Non-static field 'ocString' cannot be referenced from a static context
//            System.out.println(ocString);
            System.out.println(staticFromOuterClass);
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.instanceFromOuterClass);
        }
        public static void staticTest() {
//            Non-static field 'ocString' cannot be referenced from a static context
//            System.out.println(ocString);
            System.out.println(staticFromOuterClass);
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.instanceFromOuterClass);
        }
    }
}