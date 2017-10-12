import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Compare {

  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<Integer>();
    Random r = new Random();
    while(ll.size() < 50000) {
      ll.add(r.nextInt());
    }
    long startTime = System.currentTimeMillis();
    Iterator itr = ll.iterator();
    while (itr.hasNext()) {
        itr.next();
    }
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.print("Iterating through: ");
    System.out.println(executionTime);

    startTime = System.currentTimeMillis();
    for (int i = 0; i < ll.size(); i++) {
      ll.get(i);
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.print("using get(i)");
    System.out.println(executionTime);

    System.out.println("*********************");

    startTime = System.currentTimeMillis();
    LinkedList<Integer> l = new LinkedList<Integer>();
    while(l.size() < 50000) {
      l.add(r.nextInt(50000));
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Create LinkedList: " + Long.toString(executionTime));

    startTime = System.currentTimeMillis();
    ArrayList<Integer> al = new ArrayList<Integer>();
    while(al.size() < 50000) {
      al.add(r.nextInt(50000));
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Create ArrayList: " + Long.toString(executionTime));

    startTime = System.currentTimeMillis();
    int[] ar = new int[50000];
    for (int i = 0; i < 50000; i++) {
      ar[i] = r.nextInt(50000);
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Create Array: " + Long.toString(executionTime));

    startTime = System.currentTimeMillis();
    for (int i : l) {
      continue;
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Traverse LinkedList: " + Long.toString(executionTime));


    startTime = System.currentTimeMillis();
    for (int i : al) {
      continue;
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Traverse ArrayList: " + Long.toString(executionTime));

    startTime = System.currentTimeMillis();
    for (int i : ar) {
      continue;
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Traverse Array: " + Long.toString(executionTime));

    startTime = System.currentTimeMillis();
    for (int i = 0; i < 50000; i++) {
      l.removeFirst();
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Delete LinkedList: " + Long.toString(executionTime));

    startTime = System.currentTimeMillis();
    for (int i = 0; i < 50000; i++) {
      al.remove(0);
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Delete ArrayList: " + Long.toString(executionTime));

    startTime = System.currentTimeMillis();
    for (int i = 0; i < 50000; i++) {
      ar[i] = 0;
    }
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Delete array: " + Long.toString(executionTime));

    System.out.println("**********************");

    PriorityQueue<String> p1 = new PriorityQueue<String>();
    PriorityQueue<String> p2 = new PriorityQueue<String>();
    p1.offer("George");
    p1.offer("Jim");
    p1.offer("John");
    p1.offer("Blake");
    p1.offer("Kevin");
    p1.offer("Michael");
    p2.offer("George");
    p2.offer("Katie");
    p2.offer("Kevin");
    p2.offer("Michelle");
    p2.offer("Ryan");
    PriorityQueue p3 = new PriorityQueue<String>(p2);
    p3.retainAll(p1);
    System.out.print("Intesection: ");
    System.out.println(p3);

    PriorityQueue p4 = new PriorityQueue<String>(p2);
    for (String s : p1) {
      if ( !p3.contains(s) ) {
        p4.add(s);
      }
    }
    System.out.print("Union: ");
    System.out.println(p4);

    PriorityQueue p5 = new PriorityQueue<String>();
    for (String s : (PriorityQueue<String>)p4) {
      if (!p3.contains(s)) {
        p5.add(s);
      }
    }
    System.out.print("Difference: ");
    System.out.println(p5);

  }
}