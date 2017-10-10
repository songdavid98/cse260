import java.util.LinkedHashSet;
import java.util.Arrays;

public class SetOperations {

	public static void printUnion( LinkedHashSet<String> a, LinkedHashSet<String> b) {
		LinkedHashSet<String> copya = (LinkedHashSet<String>)a.clone();
		for (String s : b) {
			if ( !copya.contains(s) ) 
				copya.add(s);
		}
		System.out.println(copya);
	}

	public static void printIntersection( LinkedHashSet<String> a, LinkedHashSet<String> b) {
		LinkedHashSet<String> copya = new LinkedHashSet<String>();
		for (String s : b) {
			if ( a.contains(s) ) 
				copya.add(s);
		}
		System.out.println(copya);
	}

	public static void printDifference( LinkedHashSet<String> a, LinkedHashSet<String> b) {
		LinkedHashSet<String> copya = new LinkedHashSet<String>();
		for (String s : a) {
			if ( !b.contains(s) ) 
				copya.add(s);
		}
		System.out.println(copya);
	}	

	public static void main(String[] args) {
		LinkedHashSet<String> a =  new LinkedHashSet<String>( 
			Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		LinkedHashSet<String> b =  new LinkedHashSet<String>( 
			Arrays.asList( "George", "Katie", "Kevin", "Michelle", "Ryan" ));	
		System.out.print("Union: ");
		printUnion(a, b);
		System.out.print("Intesection: ");
		printIntersection(a, b);
		System.out.print("Difference a b: ");
		printDifference(a, b);
		System.out.print("Difference b a: ");
		printDifference(b, a);		
	}
}