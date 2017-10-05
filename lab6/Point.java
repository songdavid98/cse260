import java.util.Random;
import java.util.Arrays;
public class Point implements Comparable<Point> {
  private int x;
  private int y;

  public Point() {
    x = 0;
    y = 0;
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int compareTo(Point p) {
    if (p.getX() == x)
      return y - p.getY();
    return x - p.getX();
  }

  public String toString() {
    return "( " +Integer.toString(x) + " , " + Integer.toString(y) + " )";
  }

  public static void main(String[] args) {
    Random r = new Random();

    Point[] list = new Point[100];
    for (int i = 0; i < 100; i++) {
      list[i] = new Point( r.nextInt(100), r.nextInt(100));
    }

    Arrays.sort(list);
    for (Point p : list) {
      System.out.println(p);
    }

    CompareY c = new CompareY();
    Arrays.sort(list, c);
    for (Point p : list) {
      System.out.println(p);
    }
  }

}
