package fileshandling.write;

/*It is used to write text to a character-output stream. 
It has a default buffer size, but a large buffer size can be assigned. 
It is useful for writing characters, strings, and arrays. 
It is better to wrap this class with any writer class for writing data to a file if no prompt output is required.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03BufferedWriter {

  public static void main(String[] args) {

    // Assigning the file content
    // Note: Custom contents taken as input to illustrate
    String text = "Example of BufferedWriter method in Java";

    // Try block to check for exceptions
    try {

      // Step 1: Create an object of BufferedWriter
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./BufferedWriter.txt"));

      // Step 2: Write text(content) to file
      bufferedWriter.write(text);

      // Step 3: Printing the content inside the file on the terminal/CMD
      System.out.println(text);

      // Step 4: Display message showcasing
      // successful execution of the program
      System.out.print("File is created successfully with the content.");

      // Step 5: Close the BufferedWriter object
      bufferedWriter.close();
    }

    // Catch block to handle if exceptions occurs
    catch (IOException e) {

      // Print the exception on console
      // using getMessage() method
      System.out.print(e.getMessage());
    }
  }
}
