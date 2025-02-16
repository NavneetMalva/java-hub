*CURSORS*

## 1. Enumeration
* Introduced in 1.0 version(for Legacy).
* We can use Enumeration to get Objects one by one from the old Collection Objects(Legacy Collections).
* We can create Enumeration Object by using elements() method of Vector class.
```
Public Enumeration elements();
Example :
Enumeration e=v.elements();
v : vector
```

Method of Enumeration
* Enumeration defines the following two methods
* public boolean hasMoreElements();
* public Object nextElement();

## 2. Iterator
- We can apply Iterator concept for any Collection object hence it is universal cursor.
- By using Iterator we can perform both read and remove operations.

Methods in Iterator
* Iterator interface defines the following three methods.
  i. public boolean hasNext()
  ii. public Object next()
  iii. public void remove()

Limitations of Iterator
1. By using Enumeration and Iterator we can move only towards forward direction and we can't move to the backward direction, and hence these are single direction cursors.
2. By using Iterator we can perform only read and remove operations and we can't perform replacement of new Objects.
   Note: To overcome above limitations of Iterator we should go for Listiterator


## 3. ListIterator
1. By using Listiterator we can move either to the forward direction or to the backward direction, and hence Listlterator is bidirectional cursor.
2. By using Listiterator we can perform replacement and addition of new Objects in addition to read and remove operations.

Methods in ListIterator
* Listlterator is the child interface of Iterator and hence all methods of Iterator by default available to Listiterator.
* Listiterator Interface defines the following 9 methods
- forward direction
1. public boolean hasNext ()
2. public void next()
3. public int nextindex ()
- Backward direction
4. public boolean hasPrevious()
5. public void previous()
6. public int previousIndex ()
- other capability methods
7. public void remove()
8. public void set(Object new)
9. public void add(object new)