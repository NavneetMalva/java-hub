package fileshandling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03Scanner {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("./readfile.txt");
    Scanner sc = new Scanner(file);
    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }
  }


}
