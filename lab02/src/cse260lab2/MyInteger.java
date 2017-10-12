package cse260lab2;

public class MyInteger {

	public int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public boolean isEven() {
		return value%2==0;
	}
	
	public boolean isOdd() {
		return value%2==1;
	}
	
	public boolean isPrime() {
		if (value==1)
			return false;
		for (int i = 2; i <= value/2; i++) {
			if (value%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger i) {
		return i.isEven();
	}
	
	public static boolean isOdd(MyInteger i) {
		return i.isOdd();
	}
	
	public static boolean isPrime(MyInteger i) {
		return i.isPrime();
	}
	
	public boolean equals(int i) {
		return value==i;
	}
	
	public boolean equals(MyInteger i) {
		return i.equals(this.value);
	}
	
	public static int parseInt(String str) {
		int result = 0;
		
		for (int i = str.length()-1, power = 0; i >= 0; i--, power++) {
			if (str.charAt(i)=='-')
				return result*-1;
			result += (str.charAt(i)-'0') * Math.pow(10, power);
		}
		
		return result;
	}
}
