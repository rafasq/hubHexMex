package demo.basics;

public class InnerClassEx {
    public static void main(String[] args) {
        //create object of static nested class
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass innerClass = outerClass1.new InnerClass();
        innerClass.test();
    }
}

class OuterClass1 {
    public String instanceFromOuterClass= "instanceFromOuterClass";
    public static String staticFromOuterClass= "staticFromOuterClass";
    class InnerClass {
        public  void test() {
//            Non-static field 'instanceFromOuterClass' can be referenced from a inner class
            System.out.println(instanceFromOuterClass);
            System.out.println(staticFromOuterClass);
        }
////        Static declarations in inner classes are not supported at language level '8'
//        public static void staticTest() {
//        }
    }
}