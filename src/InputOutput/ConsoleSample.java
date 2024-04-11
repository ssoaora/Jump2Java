package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleSample {

  public static void main(String[] args) throws IOException {

    /*
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
     */

    /*
    char[] buffer = new char[3];
    reader.read(buffer);
    System.out.println(buffer);

    String a = br.readLine();
    System.out.println(a);
     */

    Scanner scanner = new Scanner(System.in);
    System.out.println(scanner.next());
  }

}
