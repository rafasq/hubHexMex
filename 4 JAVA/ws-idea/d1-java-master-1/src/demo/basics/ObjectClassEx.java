package demo.basics;

public class ObjectClassEx {
    public static void main(String[] args) {
        TestClass testClassObject = new TestClass();
//       String testClassString =  testClassObject.toString();
//        System.out.println(testClassString);
        System.out.println(testClassObject);
    }
}


class TestClass  {
    public String message = "Welcome to the Object Class";
    @Override
    public String toString() {
        return message;
    }
}