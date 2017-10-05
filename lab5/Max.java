public class Max {

  public static <E extends Comparable<E>> E max(E[] list) {
    E max = list[0];
    for (E element : list) {
      if (element.compareTo(max) > 0) {
        max = element;
      }
    }
    return max;

  }

  public static void main(String[] args) {
    String[] list = {"A","B","C"};
    System.out.println(max(list));
  }
}
