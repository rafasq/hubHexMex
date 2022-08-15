package demo.basics;

public class ForEachEx {
    public static void main(String[] args) {
//        array cannot be resized / fixed to 3
        String colors[] = {"red","green","blue"};
//        traditional
        for(int count = 0; count < colors.length; count++){
            System.out.println(colors[count]);
        }
//        The for-each construct gets rid of the clutter and the opportunity for error.
        for(String color: colors){
            System.out.println(color);
        }
    }
}
