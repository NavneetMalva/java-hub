package fileshandling.read;

/*
 * There are multiple ways of writing and reading a text file in Java. 
 * this is required while dealing with many applications. 
 * There are several ways to read a plain text file in Java 
 * e.g. you can use FileReader, BufferedReader, or Scanner to read a text file. 
 * Every utility provides something special 
 * e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.

Methods:
Using BufferedReader class
Using Scanner class
Using File Reader class
Reading the whole file in a List
Read a text file as String

*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex01BufferedReader {

	public static void main(String[] args) throws Exception {

		// File path is passed as parameter
		File file = new File("./readfile.txt");

		// Creating an object of BufferedReader class
		BufferedReader br = new BufferedReader(new FileReader(file));

		// Declaring a string variable
		String st;
		// Condition holds true till
		// there is character in a string
		while (( st = br.readLine()) != null)
			System.out.println(st);
	}
}
