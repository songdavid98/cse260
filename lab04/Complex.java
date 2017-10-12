public class Complex {

	public double r;
	public double i;

	public Complex() {
		r = 0;
		i= 0;
	}

	public Complex(double r) {
		this.r = r;
		i = 0;
	}

	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}

	public double getRealPart() {
		return r;
	}

	public double getImaginaryPart() {
		return i;
	}

	public Complex add(Complex c) {
		return new Complex(r+c.getRealPart(), i+c.getImaginaryPart());
	}

	public Complex subtract(Complex c) {
		return new Complex(r-c.getRealPart(), i-c.getImaginaryPart());
	}

	public Complex multiply(Complex c) {
		return new Complex(r*c.getRealPart()-i*c.getImaginaryPart(), i*c.getRealPart()+r*c.getImaginaryPart());
	}

	public Complex divide(Complex c) {
		double abs = c.getRealPart()*c.getRealPart()+c.getImaginaryPart()*c.getImaginaryPart();
		return new Complex( (r*c.getRealPart()+i*c.getImaginaryPart())/abs , (i*c.getRealPart()-r*c.getImaginaryPart())/abs);
	}

	public String toString() {
		if (i == 0)
			return Double.toString(r);
		return Double.toString(r)+  " + "+ Double.toString(i) + "i";
	}
}
