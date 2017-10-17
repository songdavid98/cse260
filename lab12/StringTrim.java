import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class StringTrim {


	public static void trim(List<String> list) {
		list.replaceAll( str -> str.trim() );
		// list
		// 	.stream()
		// 	.replaceAll( str -> str.trim() );

	}

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>( Arrays.asList( new String[] {"      a ", " b ", " c          "} ) );
		System.out.print("Before: ");
		System.out.println(l);

		trim(l);

		System.out.print("After: ");
		System.out.println(l);

		

	}
}