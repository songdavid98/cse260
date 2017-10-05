package cse260lab2;

public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger mi = new MyInteger(1);
		System.out.println( "1 is even" );
		System.out.println( mi.isEven() );
		System.out.println( "1 is odd" );
		System.out.println( mi.isOdd() );
		System.out.println( "1 is prime" );
		System.out.println( mi.isPrime() );
		System.out.println( "1 equals 1" );
		System.out.println( mi.equals(1) );
		System.out.println( "1 equals 2" );
		System.out.println( mi.equals(2) );
		
		
		
		MyInteger mi2 = new MyInteger(2);
		System.out.println( "2 is even" );
		System.out.println( mi2.isEven() );
		System.out.println( "2 is odd" );
		System.out.println( mi2.isOdd() );
		System.out.println( "2 is prime" );
		System.out.println( mi2.isPrime() );
		System.out.println( "2 equals 2" );
		System.out.println( mi.equals(mi2) );
		
		System.out.println( "1 is even" );
		System.out.println( MyInteger.isEven(mi) );
		System.out.println( "1 is odd" );
		System.out.println( MyInteger.isOdd(mi) );
		System.out.println( "1 is prime" );
		System.out.println( MyInteger.isPrime(mi) );
		
		System.out.println(MyInteger.parseInt("-347"));

	}

}
