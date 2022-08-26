package demo.basics;

public class StringEx {
    public static void main(String[] args) {
        String quote = " quote 1 ";
        System.out.println(quote.length());
        quote = quote.trim();
        System.out.println(quote.length());

        String fruit = new String("Mango");
        String fruit1 = new String("Mango");
//        compares address (identical)
        if(fruit == fruit1)
            System.out.println(true);
        else
            System.out.println(false);

        //        compares values
        if(fruit.equals(fruit1))
            System.out.println(true);
        else
            System.out.println(false);
    }

}
