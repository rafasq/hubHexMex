package demo.basics;
// Object toString(), wait(), notify(), equals(), clone()
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("clean up operations like closing connections....");
    }
}