package demo.collections;

import java.util.*;
public class ArrayListEx {
//    THREAD SAFE IS ALSO CALLED AS SYNCHRONIZED
//    SYNCHRONIZED : VECTOR, HASHTABLE, CONCURRENTHASHMAP
    // NOT SYNCHRONIZED ALSO CALLED AS NON THREAD SAFE : ARRAYLIST, HASHSET....
    public static void main(String[] args) {
        // allows duplicates, unsorted, allows nulls, fastest list in storing and accessing data
List arrayList = new ArrayList();
//arrayList.add(null);
        arrayList.add("pup");
//arrayList.add(null);
        arrayList.add("dup");
        arrayList.add("cup");
        System.out.println(arrayList);

//        Arrays.sort(arrayList); //no
        Collections.sort(arrayList); // yes
        System.out.println(arrayList);
// ArrayList is not synchronized, not thread-safe
//        Vector is synchronized , thread safe.
        //   array cannot be resized / fixed to 3
        String colors[] = {"red","green","blue"};
        String colorsNewArray[] = {"red","green","blue","yellow"};

//      Returns a fixed-size list backed by the specified array.
//      (Changes to the returned list "write through" to the array.)
//        List colorsNewList =  Arrays.asList(colorsNewArray);
//        colorsNewList.set(0,"cyan");
//        colorsNewList.add("blue");
//        System.out.println(colorsNewList);

//        ArrayList colorsNewList1 =  new ArrayList();
//        Collections.addAll(colorsNewList1, colorsNewArray);
//        colorsNewList1.add("blue");
//        System.out.println(colorsNewList1);

//        List listFromArray = Arrays.asList(colorsNewArray);
//        ArrayList colorsArrayList = new ArrayList(listFromArray);
//        ArrayList colorsArrayList = new ArrayList(Arrays.asList(colorsNewArray));
//        ArrayList colorsArrayList = new ArrayList(Arrays.asList(colorsNewArray));
//        ArrayList colorsArrayListTest = new ArrayList(Arrays.asList(colorsNewArray), Arrays.asList(colors));
//        ArrayList colorsArrayListTest = new ArrayList(Arrays.asList(colorsNewArray));
//        colorsArrayListTest.addAll(Arrays.asList(colors));
//      System.out.println(colorsArrayListTest);


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
        colorsArrayList.add(null);
        colorsArrayList.add("blue");
        colorsArrayList.add(null);
        colorsArrayList.add("yellow");
      Object[] colorsArray =  colorsArrayList.toArray();
        for(Object color : colorsArray) {
            System.out.print(color + " ");
        }
        System.out.println(colorsArray);
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
