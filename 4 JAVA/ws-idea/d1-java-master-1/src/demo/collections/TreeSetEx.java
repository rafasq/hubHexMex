package demo.collections;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet colorsSet = new TreeSet();
//        boolean added = false;
//        added = colorsSet.add("red");
//        if(added) {
//            System.out.println("Added");
//        } else {
//            System.out.println("Failed Adding");
//        }
        System.out.println(colorsSet.size());
        colorsSet.add("red");
        colorsSet.add("green");
        System.out.println(colorsSet.size());
        System.out.println(colorsSet);
        colorsSet.remove("red");
        System.out.println(colorsSet);
        System.out.println(colorsSet.isEmpty());
        colorsSet.clear();
        System.out.println(colorsSet.isEmpty());
//        no insertion order
        colorsSet.add("yellow");
        colorsSet.add("red");
//        colorsSet.add(null);
        colorsSet.add("blue");
//        colorsSet.add(null);
        System.out.println(colorsSet);
        System.out.println("******");
      Object[] colorsArray =  colorsSet.toArray();
        for(Object color : colorsArray) {
            System.out.print(color + " ");
        }
//        System.out.println();
//        System.out.println(colorsArray);
        System.out.println();
        System.out.println(colorsSet.size());
        System.out.println(colorsSet);

//        target of the "for-each loop" statement
//        An ordered collection (also known as a sequence).
//        Unlike sets, lists typically allow duplicate elements.
//        The user can access elements by their integer index
        //traditional
        Object colorsArrayFromSet[] = colorsSet.toArray();
        for(int index =0; index < colorsSet.size(); index++ ){
            System.out.print(colorsArrayFromSet[index]);
        }
        System.out.println();
        // updated Iterable interface
        for(Object color : colorsSet) {
            System.out.print(color);
        }
        System.out.println();
        // java 8 (1.8) for each (latest)
//        colorsSet.forEach((color) -> System.out.println(color));
//        colorsSet.forEach(System.out::print);
        System.out.println();
        System.out.println(colorsArrayFromSet[1]);
        System.out.println(colorsSet);
    }
}
