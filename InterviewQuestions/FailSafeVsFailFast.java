/*

** Concurrent Modification **
Concurrent Modification in programming means to modify an object concurrently when another task is already running over it. For example, in Java to modify a collection when another thread is iterating over it. Some Iterator implementations (including those of all the general purpose collection implementations provided by the JRE) may choose to throw ConcurrentModificationException if this behavior is detected.

** Fail Fast And Fail Safe Iterators in Java **
Iterators in java are used to iterate over the Collection objects.Fail-Fast iterators immediately throw ConcurrentModificationException if there is structural modification of the collection. Structural modification means adding, removing any element from collection while a thread is iterating over that collection. Iterator on ArrayList, HashMap classes are some examples of fail-fast Iterator.
Fail-Safe iterators don't throw any exceptions if a collection is structurally modified while iterating over it. This is because, they operate on the clone of the collection, not on the original collection and that's why they are called fail-safe iterators. Iterator on CopyOnWriteArrayList, ConcurrentHashMap classes are examples of fail-safe Iterator.

** How Fail Fast Iterator works? **
To know whether the collection is structurally modified or not, fail-fast iterators use an internal flag called modCount which is updated each time a collection is modified.Fail-fast iterators checks the modCount flag whenever it gets the next value (i.e. using next() method), and if it finds that the modCount has been modified after this iterator has been created, it throws ConcurrentModificationException.


** Important points of fail-fast iterators **

-> These iterators throw ConcurrentModificationException if a collection is modified while iterating over it.
-> They use original collection to traverse over the elements of the collection.
-> These iterators don’t require extra memory.
    Ex : Iterators returned by ArrayList, Vector, HashMap.


** Note 2 ** 
If you remove an element via Iterator remove() method, exception will not be thrown. However, 
in case of removing via a particular collection remove() method, ConcurrentModificationException
will be thrown.


** Fail Safe Iterator **

First of all, there is no term as fail-safe given in many places as Java SE specifications does not use this term. 
I am using this term to demonstrate the difference between Fail Fast and Non-Fail Fast Iterator. These iterators 
make a copy of the internal collection (object array) and iterates over the copied collection. Any structural 
modification done to the iterator affects the copied collection, not original collection. So, original collection 
remains structurally unchanged. 

-> Fail-safe iterators allow modifications of a collection while iterating over it.
-> These iterators don't throw any Exception if a collection is modified while iterating over it.
-> They use copy of original collection to traverse over the elements of the collection.
-> These iterators require extra memory for cloning of collection. Ex : ConcurrentHashMap, CopyOnWriteArrayList


*** Important ***

Also, those collections which don't use fail-fast concept may not necessarily create clone/snapshot 
of it in memory to avoid ConcurrentModificationException. For example, in case of ConcurrentHashMap, 
it does not operate on a separate copy although it is not fail-fast. Instead, it has semantics 
that is described by the official specification as weakly consistent(memory consistency properties in Java)


** Note(from java-docs) **

The iterators returned by ConcurrentHashMap is weakly consistent. This means that this iterator can tolerate concurrent modification, traverses elements as they existed when iterator was constructed and may (but not guaranteed to) reflect modifications to the collection after the construction of the iterator.


*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeVsFailFast {
   static void failFastExample() {
      Map<Long, String> studentMap = new HashMap<>();

      studentMap.put(1L, "modiji");
      studentMap.put(2L, "ram");
      studentMap.put(3L, "shyam");
      studentMap.put(4L, "krishna");

      Iterator<Map.Entry<Long,String>> iterator = studentMap.entrySet().iterator();

      while(iterator.hasNext()) {
         var entry = iterator.next();

         // throw ConcurrentModificationException
         studentMap.put(5L, "jay");

         // Does not throw any error
         iterator.remove();

         IO.println(entry + " ");
      }

      IO.println("\n" + studentMap);
   }

   static void failSafeExampleWithConcurrentHashMap() {
      Map<Long, String> studentMap = new ConcurrentHashMap<>();

      studentMap.put(1L, "modiji");
      studentMap.put(2L, "ram");
      studentMap.put(3L, "shyam");
      studentMap.put(4L, "krishna");

      Iterator<Map.Entry<Long, String>> iterator = studentMap.entrySet().iterator();

      while (iterator.hasNext()) {
         var entry = iterator.next();

         // Does not throw any exception
         studentMap.put(5L, "jay");

         iterator.remove();

         IO.print(entry + " ");
      }

      IO.print("\n" + studentMap);
   }
   
   static void failSafeExampleWithCopyOnWriteArrayList() {
      List<Object> list = new CopyOnWriteArrayList<>();
      
      list.add("modiji");
      list.add("ram");
      list.add("shyam");
      list.add("krishna");

      Iterator<Object> iterator = list.iterator();

      while (iterator.hasNext()) {
         Object ele = iterator.next();

         // Does not throw any exception
         list.add("kamni");

         // throws UnSupportedOperationException
         iterator.remove();

         IO.print(ele + " ");
      }

      IO.println("\n" + list);
   }

   public static void main(String[] studentMap) {
      // failSafeExampleWithConcurrentHashMap();
      failSafeExampleWithCopyOnWriteArrayList();
      // failFastExample();
   }
}
