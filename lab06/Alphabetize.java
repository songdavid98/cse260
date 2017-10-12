import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Scanner;

import java.util.Arrays;

public class Alphabetize {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter file name: \n");

    InputStream is = new FileInputStream(sc.nextLine());

    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    String line = br.readLine();
    StringBuilder sb = new StringBuilder();
    while(line != null){
          sb.append(line).append("\n");
          line = br.readLine();
    }
    String content = sb.toString();

    System.out.println(content);

    System.out.println("This will now be alphabetezed\n");

    String[] sarray = content.split(" ");
    Arrays.sort(sarray);

    for (String s : sarray) {
      System.out.println(s);
    }

  }
}
