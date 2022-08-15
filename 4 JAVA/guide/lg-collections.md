:green_book: **COLLECTIONS**  

https://docs.oracle.com/javase/8/docs/api/index.html?overview-summary.html

:beginner: _**JCF Java Collections Framework / Library**_  

:book: **Interfaces**  

:writing_hand: **_Iterable_**  
 - Implementing this interface allows an object to be the target of the "for-each loop" statement. 

:writing_hand: **_Collection_**  

- The root interface in the collection hierarchy.
- A collection represents a group of objects, known as its elements. 
- Some collections allow duplicate elements and others do not.
- Some are ordered and others unordered.
- The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List.
- API
    - boolean add(E e)
    - void clear()
    - boolean contains(Object o)
    - boolean isEmpty()
    - boolean remove(Object o)
    - Object[] toArray()

:writing_hand: **_List_**  

- An ordered collection (also known as a sequence). 
- The user of this interface has precise control over where in the list each element is inserted. 
- The user can access elements by their integer index (position in the list), and search for elements in the list.
- Unlike sets, lists typically allow duplicate elements. 

:book: **Classes**  

:writing_hand: **_ArrayList_**  
- Resizable-array implementation of the List interface.
- Permits null. 
