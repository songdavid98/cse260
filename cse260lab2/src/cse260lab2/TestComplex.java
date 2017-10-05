package cse260lab2;

import java.util.Scanner;

public class TestComplex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First complex number A");

		System.out.println("Please enter real part");
		double r = Double.parseDouble(sc.nextLine());
		
		System.out.println("Please enter imaginary part");
		double i = Double.parseDouble(sc.nextLine());
		
		Complex a = new Complex(r, i);
		

		System.out.println("Second complex number B");

		System.out.println("Please enter real part");
		double r2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Please enter imaginary part");
		double i2 = Double.parseDouble(sc.nextLine());
		
		Complex b = new Complex(r2, i2);
		
		System.out.println("A+B");
		System.out.println( a.add(b));
		
		System.out.println("A-B");
		System.out.println( a.subtract(b));

		System.out.println("A*B");
		System.out.println( a.multiply(b));
		
		System.out.println("A/B");
		System.out.println( a.divide(b));
	}

}
