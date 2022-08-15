package demo.collections;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        //   array cannot be resized / fixed to 3
        String colors[] = {"red","green","blue"};
        String colorsNew[] = {"red","green","blue","yellow"};

//    ArrayList Resizable-array implementation
        ArrayList colorsArrayList = new ArrayList();
//        boolean added = false;
//        added = colorsArrayList.add("red");
//        if(added) {
//            System.out.println("Added");
//        } else {
//            System.out.println("Failed Adding");
//        }
        System.out.println(colorsArrayList.size());
        colorsArrayList.add("red");
        colorsArrayList.add("green");
        System.out.println(colorsArrayList.size());
        System.out.println(colorsArrayList);
        colorsArrayList.remove("red");
        System.out.println(colorsArrayList);
        System.out.println(colorsArrayList.isEmpty());
        colorsArrayList.clear();
        System.out.println(colorsArrayList.isEmpty());
        colorsArrayList.add("red");
        colorsArrayList.add("blue");
        colorsArrayList.add("yellow");
      Object[] colorsArray =  colorsArrayList.toArray();

        System.out.println(colorsArray);
        for(Object color : colorsArray) {
            System.out.print(color + " ");
        }
        System.out.println();
        System.out.println(colorsArrayList.size());
        System.out.println(colorsArrayList);

//        target of the "for-each loop" statement
//        An ordered collection (also known as a sequence).
//        Unlike sets, lists typically allow duplicate elements.
//        The user can access elements by their integer index
        //traditional
        for(int index =0; index < colorsArrayList.size(); index++ ){
            System.out.print(colorsArrayList.get(index) + " ");
        }
        System.out.println();
        // updated Iterable interface
        for(Object color : colorsArrayList) {
            System.out.print(color);
        }
        System.out.println();
        // java 8 (1.8) for each (latest)
//        colorsArrayList.forEach((color) -> System.out.println(color));
//        colorsArrayList.forEach(System.out::print);
        System.out.println();
        System.out.println(colorsArrayList.get(1));
        System.out.println(colorsArrayList);
    }
}
