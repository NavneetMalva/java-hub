package fileshandling.write;

/*
 Java FileWriter class in java is used to write character-oriented data to a file as 
 this class is character-oriented class because of what it is used in file handling in java. 

There are many ways to write into a file in Java as there are many classes and methods which can fulfill the goal as follows:

    Using writeString() method
    Using FileWriter Class
    Using BufferedWriter Class
    Using FileOutputStream Class
    */

//Importing required classes

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Ex01WriteString {

  // Main driver method
  public static void main(String[] args) {
    // Assigning the content of the file
    String text = "Welcome to JavaProgramming\nHappy Learning!";

    // Defining the file name of the file
    Path fileName = Path.of("./writeString.txt");

    try {
      // Writing into the file
      Files.writeString(fileName, text);

      // Reading the content of the file
      String fileContent = Files.readString(fileName);

      // Printing the content inside the file
      System.out.println(fileContent);
    } catch (IOException e) {
      // Handling any I/O exceptions
      System.err.println("An error occurred: " + e.getMessage());
    }
  }
}
