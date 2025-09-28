### Question: Exception handling w.r.t. Method overriding

### Answer:

- If the parent class method does not declare an exception, then
  child class overridden method cannot declare checked
  exceptions, but it can declare unchecked exceptions
- If the parent class method declares an exception, then child
  class overridden method
- can declare no exception
- can declare same exception
- can declare a narrower exception (more broader exception declaration than parent one is not allowed)

---

| Parent Declaration | Child Declaration          | Valid?    |
|--------------------|----------------------------|-----------|
| No exception       | Checked exception          | ❌ Invalid |
| No exception       | Unchecked exception        | ✅ Valid   |
| Exception          | No exception               | ✅ Valid   |
| Exception          | Same exception             | ✅ Valid   |
| Exception          | Narrower checked exception | ✅ Valid   |
| Exception          | Broader checked exception  | ❌ Invalid |

---

1. Checked Exceptions
   Definition: Exceptions that are checked at compile time.
   The compiler forces you to either handle them with try-catch or declare them with throws.
   They usually represent recoverable conditions (things you can reasonably handle).
   Common Checked Exceptions
   ```
   IOException
   SQLException
   ClassNotFoundException
   InterruptedException
   FileNotFoundException
   NoSuchMethodException
   InstantiationException
   InvocationTargetException
   TimeoutException`

2. Unchecked Exceptions
   Definition: Exceptions that are not checked at compile time.
   Subclasses of RuntimeException.
   You are not forced to handle or declare them.
   They usually represent programming errors (bugs in code, bad assumptions, etc.).
   Common Unchecked Exceptions
    ```
   NullPointerException
   ArrayIndexOutOfBoundsException
   ArithmeticException (e.g. divide by zero)
   IllegalArgumentException
   IllegalStateException
   ClassCastException
   NumberFormatException
   UnsupportedOperationException`