import java.util.Scanner;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListStore {

  public LinkedList<Float> list;

  public LinkedListStore() {
    list = new LinkedList<Float>();

  }

  public void add(float num) {
    if (list.contains(num))
      return;
    list.addLast(num);
  }

  public static float findMin(LinkedList<Float> list){
    float min = list.element();
    for (float f : list) {
      if (min > f) {
        min = f;
      }
    }
    return min;
  }

  public static void printSorted(LinkedList<Float> list) {
    LinkedList<Float> temp = (LinkedList<Float>)list.clone();
    while(temp.peek() != null) {
      float min = findMin(temp);
      System.out.println(min);
      temp.remove(min);
    }
  }

  public static void printShuffled(LinkedList<Float> list) {
    LinkedList<Float> temp = (LinkedList<Float>)list.clone();
    while(temp.peek() != null) {
      Random r = new Random();
      System.out.println(temp.remove( r.nextInt(temp.size()) ));
    }
  }

  public static void printReversed(LinkedList<Float> list) {
    for (int i = list.size()-1; i >= 0; i--) {
      System.out.println(list.get(i));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String numString = sc.nextLine();

    String[] stringArray = numString.split(" ");

    LinkedListStore list = new LinkedListStore();
    for (String s : stringArray) {
      list.add(Float.parseFloat(s));
    }
    System.out.println("This is sorted: ");
    printSorted(list.list);
    System.out.println("This is shuffled: ");
    printShuffled(list.list);
    System.out.println("This is reversed: ");
    printReversed(list.list);
  }
}
