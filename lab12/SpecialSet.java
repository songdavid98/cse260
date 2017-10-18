import java.util.TreeSet;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;

// class StringComparator implements Comparator<String> {
// 	public int compare(String a, String b) {
// 		return a.toUpperCase().compareTo(b.toUpperCase());
// 	}
// }


public class SpecialSet {

	public static void main(String[] args) {
		
		ArrayList<String> arguments = new ArrayList<String>( Arrays.asList( args ) );

		StringComparator sc = new StringComparator();

//		TreeSet<String> set = new TreeSet<String>(sc);
		TreeSet<String> set = new TreeSet<String>( (a,b) -> a.toUpperCase().compareTo(b.toUpperCase()));

		arguments
			.stream()
			.forEach(s -> set.add(s));

		System.out.println(set);
	}
}