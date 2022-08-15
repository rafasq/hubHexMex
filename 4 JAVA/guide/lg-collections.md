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

:writing_hand: **_Set_**  

- A collection that contains no duplicate elements.
- at most one null element. 

:book: **Classes**  

:writing_hand: **_ArrayList_**  
- Resizable-array implementation of the List interface.
- Permits null. 

:beginner: _**MAPS**_  

:book: **Interfaces**  

:writing_hand: **_Map_**  

- An object that maps keys to values. 
- A map cannot contain duplicate keys; each key can map to at most one value.
- The Map interface provides three collection views, which allow a map's contents to be viewed as
  -  a set of keys, (Set<K> keySet())
  -  collection of values, (Collection<V> values()) or 
  -  set of key-value mappings (Set<Map.Entry<K,V>> entrySet()). 
  -  the TreeMap class is orderere; others, like the 
  -  the HashMap class is not ordered.
-  API 
   -  Set<K> keySet()
   -  Collection<V> values()
   -  Set<Map.Entry<K,V>> entrySet()
   -  boolean containsKey(Object key)
   -  V get(Object key)
   -  boolean containsValue(Object value)
   -  int size()
   -  void clear()