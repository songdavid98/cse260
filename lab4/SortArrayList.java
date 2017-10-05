import java.util.ArrayList;

public class SortArrayList {

  public static <E extends Comparable<E>> void sort( ArrayList<E> list) {
    for (int i = 1; i < list.size(); i++) {
      for (int j = 0; j < i; j++) {
        if ( list.get(j).compareTo( list.get(i) ) > 0 ) { //if list[j] is greater than list[i]
          list.add( j, list.remove(i) );
          break;
        }
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("5");
    list.add("3");
    list.add("4");
    list.add("1");
    list.add("2");
    SortArrayList.sort(list);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
