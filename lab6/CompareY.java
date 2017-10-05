import java.util.Comparator;

public class CompareY implements Comparator<Point> {

  public int compare(Point a, Point b) {
    if (a.getY() == b.getY()) {
      return (a.getX() - b.getX());
    }
    else {
      return ( a.getY() - b.getY());
    }
  }

  public boolean equals(Point a, Point b) {
    return a.getY()==b.getY() && a.getX()==b.getX();
  }
}
