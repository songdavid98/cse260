import java.util.ArrayList;
import java.util.Scanner;

public class GenericStackExtendsArrayList<E> extends ArrayList<E>{

  public GenericStackExtendsArrayList() {

  }

  public void push(E element) {
    add(element);
  }

  public E pop() {
    return remove( size()-1);
  }

  public static void main(String[] args) {
    GenericStackExtendsArrayList<String> g = new GenericStackExtendsArrayList<String>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 5 strings");
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String s3 = sc.nextLine();
    String s4 = sc.nextLine();
    String s5 = sc.nextLine();
    g.push(s1);
    g.push(s2);
    g.push(s3);
    g.push(s4);
    g.push(s5);

    while (!g.isEmpty()) {
      System.out.println(g.pop());
    }
  }
}
