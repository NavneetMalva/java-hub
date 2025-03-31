package fileshandling.read;

import java.io.File;
import java.io.FileReader;

public class Ex02FileReader {

  public static void main(String[] args) throws Exception {

    File file = new File("./readfile.txt");

    FileReader filereader = new FileReader(file);
    int i;

    while ((i = filereader.read()) != -1) {
      System.out.print((char) i);
    }

  }

}
