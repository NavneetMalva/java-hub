## ArrayList

* ArrayList and Vector classes implements RandomAccess interface so that we can access any Random element with the same speed.
* Hence if our frequent operation is retrieval operation then ArrayList is the best choice.
* ArrayList is best choice if our frequent operation is retrieval operation (Because ArrayList implements  RandomAccessinterfaces)
* ArrayList is the worst choice if our frequent operation is insertion or deletion in the middle (Because several shift operation are require)

Note :
* Only ArrayList and Vector classes implements RandomAccess interface.
* TreeSet and TreeeMap does not support Hetrogenous insertion.

* new capacity of LinkedList = (current_capacity *1.5) +1
* new capacity of vector = (current_capacity *2)


## LinkedList

* The underlying data structure is Double Linked List.
* Insertion order is preserved .
* Duplicates are allowed.
* Heterogeneous Objects are allowed.
* Null insertion is possible.

* LinkedList implements Serializable and Clonable interfaces but not RandomAccess interface.
* LinkedList is the best choice if our frequent operation is insertion or deletion in the middle.
* LinkedList is the worst choice if our frequent operation is retrieval operation.

## ArrayList vs LinkedList
- It is the best choice if our frequent operation is retrieval
- It is the best choice if our frequent Operation is insertion and deletion
- ArrayList is the worst choice if our frequent operation is insertion or deletion
- LinkedList is the worst choice if our frequent operation is retrieval operation
- Underlying data structure for ArrayList is resizable or growable Array.
- Underlying data structure is Double Linked List.
- ArrayList implements RandomAccess interface
- LinkedList doesn't implement RandomAccess interface


## Vector
* The underlying Data structure for the vector is resizable array or growable array.
* Duplicate objects are allowed.
* Insertion order is preserved.
* 'null' insertion is possible.
* Heterogeneous objects are allowed.
* Vector class implemented Serializable, Cloneable and RandomAccess Interiaces.
* Most of the methods present in Vector are synchronized. Hence Vector object is Thread-safe.
* Best choice if the frequent operation is retrieval.

## Stack

Methods in Stack
1) Object push(Object obj);
- For inserting an object to the stack
2) Object pop();
- To removes and returns top of the stack.
3) Object peak();
- To Returns the top of the stack without removal of object.
4) int search(Object obj);
- If the specified object is available it returns its offset from top of the stack.
- If the object is not available then it returns -1.
5) Object pop();
- For inserting an object to the stack