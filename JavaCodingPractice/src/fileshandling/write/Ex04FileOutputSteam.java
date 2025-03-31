package fileshandling.write;

/*
It is used to write raw stream data to a file. 
FileWriter and BufferedWriter classes are used to write only the text to a file, 
but the binary data can be written by using the FileOutputStream class.
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04FileOutputSteam {

  public static void main(String[] args) {

    // Assign the file content
    String fileContent = "Welcome to fileoutputstream example in Java";

    // Try block to check if exception occurs
    try {

      // Step 1: Create an object of FileOutputStream
      FileOutputStream outputStream = new FileOutputStream("./FileOutputSteam.txt");

      // Step 2: Store byte content from string
      byte[] strToBytes = fileContent.getBytes();

      // Step 3: Write into the file
      outputStream.write(strToBytes);

      // Print the success message (Optional)
      System.out.print("File is created successfully with the content.");
    }

    // Catch block to handle the exception
    catch (IOException e) {

      // Display the exception/s
      System.out.print(e.getMessage());
    }
  }
}
