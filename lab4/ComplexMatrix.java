public class ComplexMatrix {


  public ComplexMatrix() {

  }

  public Complex add( Complex a, Complex b) {
    return a.add(b);
  }

  public Complex multiply( Complex a, Complex b) {
    return a.multiply(b);
  }

  public Complex zero() {
    return new Complex();
  }

  public Complex[][] addMatrix(Complex[][] a, Complex[][] b) {
    if (a.length != b.length || a[0].length != b[0].length) {
      return null;
    }
    Complex[][] result = new Complex[a.length][a[0].length];
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        result[i][j] = add( a[i][j], b[i][j]);
      }
    }
    return result;
  }

  public static void main(String[] args) {

  }
}
