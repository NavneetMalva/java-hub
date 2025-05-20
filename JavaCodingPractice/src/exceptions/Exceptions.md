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
