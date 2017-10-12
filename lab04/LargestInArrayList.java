import java.util.ArrayList;

public class LargestInArrayList {

  public static <E extends Comparable<E>> E max( ArrayList<E> list) {
    if (list.isEmpty())
      return null;
    E c = list.get(0);
    for ( E element : list) {
      if ( c.compareTo(element) < 0) {
        c = element;
      }
    }
    return c;
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("5");
    list.add("3");
    list.add("4");
    list.add("1");
    list.add("2");
    System.out.println(max(list));
  }
}
