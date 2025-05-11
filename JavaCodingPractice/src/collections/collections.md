## ArrayList

* ArrayList and Vector classes implements RandomAccess interface so that we can access any Random
  element with the same
  speed.
* Hence, if our frequent operation is retrieval operation then ArrayList is the best choice.
* ArrayList is the best choice if our frequent operation is retrieval operation (Because ArrayList
  implements
  RandomAccessInterfaces)
* ArrayList is the worst choice if our frequent operation is insertion or deletion in the middle (
  Because several shift
  operation are require)

Note :

* Only ArrayList and Vector classes implements RandomAccess interface.
* TreeSet and TreeMap does not support Heterogeneous insertion.

## ArrayList Capacity Details
### Default Capacity
When you create a new `ArrayList()`:
- The internal array is **not** immediately created.
- It is created **only when you add the first element**, at which point the default capacity becomes **10**.

### New Capacity When Full
When the internal array is full, the `ArrayList` grows using the following formula:
- `new capacity = old capacity + (old capacity / 2)`

For example:
- If the current capacity is **10**, it grows to **15**.
- Then from **15**, it grows to **22**.
- Then from **22**, it grows to **33**.
- And so on.

This gradual growth helps balance performance and memory usage.

---

### ✅ HashMap
- Default capacity:
When you create new HashMap(), the default initial capacity is 16 buckets.
- New capacity when full (resize):
When the number of entries exceeds capacity * load factor (default load factor is 0.75), the map resizes.
<br> `new capacity = old capacity * 2` <br>
So, it doubles: 16 → 32 → 64 → 128, etc.

---

## LinkedList

* The underlying data structure is Double Linked List.
* Insertion order is preserved .
* Duplicates are allowed.
* Heterogeneous Objects are allowed.
* Null insertion is possible.

* LinkedList implements Serializable and Cloneable interfaces but not RandomAccess interface.
* LinkedList is the best choice if our frequent operation is insertion or deletion in the middle.
* LinkedList is the worst choice if our frequent operation is retrieval operation.

* No capacity; it’s a linked structure, so it grows dynamically as you add elements (no preset size or resizing).

## ArrayList vs LinkedList

- ArrayList is the best choice if our frequent operation is retrieval
- ArrayList is the worst choice if our frequent operation is insertion or deletion
- ArrayList implements RandomAccess interface
- Underlying data structure for ArrayList is resizable or growable Array.



- LinkedList is the best choice if our frequent Operation is insertion and deletion
- LinkedList is the worst choice if our frequent operation is retrieval operation
- Underlying data structure is Double Linked List.
- LinkedList doesn't implement RandomAccess interface.

Note :

- ✅ Use ArrayList when fast lookups (random access) and fewer insertions/deletions are needed.
- ✅ Use LinkedList when frequent insertions/deletions at the start/middle are required.
- 🚀 General Rule: If you don't have a specific reason to use LinkedList, use ArrayList because it's
  faster for most use
  cases.

---
## Vector

* The underlying Data structure for the vector is resizable array or growable array.
* Duplicate objects are allowed.
* Insertion order is preserved.
* 'null' insertion is possible.
* Heterogeneous objects are allowed.
* Vector class implemented Serializable, Cloneable and RandomAccess Interiaces.
* Most of the methods present in Vector are synchronized. Hence Vector object is Thread-safe.
* Best choice if the frequent operation is retrieval.
---
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