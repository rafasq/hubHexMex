package demo.basics;

public class EqualsEx {
    public static void main(String[] args) {
//        in heap / 2 different memory
        String s1 = new String("welcome");
        String s2 = new String("welcome");
        // == identical vs equals
        System.out.println("Not Identical but equal");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // string constant pool
        String s3 = "welcome";
        String s4 = "welcome";
        System.out.println("Identical and equal");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
