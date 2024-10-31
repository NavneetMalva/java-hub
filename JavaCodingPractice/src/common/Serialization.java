package common;

import java.io.*;

/**
*
Serialization in Java is the process of converting an object's state into a byte stream so it can be easily stored in a file,
transmitted over a network, or saved to a database. When needed, the byte stream can be converted back into a copy of the original object through a process called deserialization.

Serialization is useful in situations where you need to persist the state of an object,
for example, in distributed applications or when saving object states between application runs.

Key Points:
To serialize an object in Java, the class must implement the Serializable interface, which is a marker interface (it has no methods).
Fields marked with the transient keyword are not serialized, meaning they are skipped during serialization.
The serialized object can later be deserialized to reconstruct the original object.
*/

class MSEmployee implements Serializable {
    private String name;
    private int age;
    private transient String email; // `transient` fields are not serialized

    public MSEmployee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // getters ans setters

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", email="+email+'}';
    }
}

public class Serialization {
    public static void main(String[] args) {
        MSEmployee employee = new MSEmployee("John smith", 26, "john.smith@gmail.com");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
            oos.writeObject(employee);
            System.out.println("Employee object has been serialized.");
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // now deserialized
        System.out.println("Deserializing...");
        try{
            ObjectInputStream iis = new ObjectInputStream(new FileInputStream("employee.ser"));
            MSEmployee employeeDes =(MSEmployee) iis.readObject();
            System.out.println("Employee object has been deserialized: " + employeeDes); // Employee{name='John smith', age=26, email=null}
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}

/**
 * In Summary
 * ObjectOutputStream performs the serialization of the object and passes the resulting byte stream to FileOutputStream.
 * FileOutputStream then handles writing that byte stream to the file (employee.ser).
 */
