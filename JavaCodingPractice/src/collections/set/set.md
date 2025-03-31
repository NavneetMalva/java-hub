## HashSet

* The underlying data structure is Hashtable.
* Duplicates are not allowed. If we are trying to insert duplicates, we won't get any compile time
  or runtime errors.
  add method simply returns false.

```
hs.add("A");
hs.add("A");
hs.add("B");
System.out.println(hs.add("B")); // false
o/p : ["A","B"]
```

* Insertion order is not preserved and all objects will be inserted based on hash-code of objects.
* Heterogeneous objects are allowed.
* 'null' insertion is possible.
* implements Serializable and Clonable interfaces but not RandomAccess.
* HashSet is the best choice, if our frequent operation is Search operation.

*Constructors of HashSet*

1) HashSet h = new HashSet;

- Creates an empty HashSet object with default initial capacity 16 & default Fill Retio 0.75

2) HashSet h = new HashSet(int initialCapacity);

- Creates an empty HashSet object with specified initial capacity & default Fill Retio 0.75

3) HashSet h = new HashSet(int initalCapacity, float loadFactor);

- Creates an empty HashSet object with specified initial capacity & specified Load Factor (or Fill
  Ratio)

4) HashSet h = new HashSet(Collection c);

- For inter conversion between Collection objects.

Load Factor / Fill Ratio :
After loading the how much factor, a new HashSet object will be created, that factor is called as
Load Factor or Fill
Ratio.

## SortedSet

```
SortedSet Specific methods
Object first - returns first element of the SortedSet 
Object last - returns last element of the SortedSet
SortedSet headSet(Object obj) - returns the SortedSet whose elements are < obj 
SortedSet tailSet(Object obj) - returns the SortedSet whose elements are >= obj
SortedSet subSet(Object obj1, Object obj2) - returns the SortedSet whose elements are >= obj1 and <obj2
* Comparator comparator()
- returns Comparator object that describes underlying sorting technique.
  If we are using default natural sorting order then we will get null.
```

## TreeSet

- If we're depending on default natural sorting order internally JVM will call CompareTo() method
  will inserting objects
  to the TreeSet. Hence the objects should be Comparable.

```
TreeSet t = new TreeSet();
t.add("B");
t.add("Z"); // "Z".compareTo("B"); +ve
t.add("A"); // "A".compareTo("B"); -ve
System.out.printint); //[A, B, Z]
```

1. If we are not satisfied with default natural sorting order or if the default natural sorting
   order is not already
   available then we can define our own customized sorting by using Comparator.
2. Comparable meant for Default Natural Sorting order where as Comparator meant for customized
   Sorting order.

***Comparator Interface***

* We can use comparator to define our own sorting (Customized sorting).
* Comparator interface present in java.util package.
* It defines two methods. compare and equals.

1) public int compare(Object obj1, Object obj2)

- returns -ve iff obj1 has to come before obj2
- returns +ve iff obj1 has to come after obj2
- returns 0 iff obj1 & obj2 are equal.

2) public boolean equals();

- Note:

1. When ever we are implementing Comparator interface, compulsory we should provide implementation
   for compare() method.
2. And implementing equals() method is optional, because it is already available in every java class
   from Object class
   through inheritance.

*Comparable Vs Comparator*

| Comparable                                             | Comparator                                                    |
|--------------------------------------------------------|---------------------------------------------------------------|
| 1. It is meant for default natural sorting order.      | 1. It is meant for customized sorting order.                  |
| 2. Present in java.lang package                        | 2. Present in java.til package                                |
| 3. This interface defines only one method compareTo(). | 3. This interface defines two methods compare() and equals(). |
