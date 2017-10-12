import java.util.Scanner;
import java.util.HashMap;

public class NumberOccurences {

	public static void main(String[] args) {
		System.out.println("Enter some integers. Enter 0 to stop:");
		Scanner sc = new Scanner(System.in);
		String s = "";
		HashMap<String, Integer> counter = new HashMap<>();

		do {
			s =  sc.nextLine();

			if (counter.containsKey(s))
				counter.put(s, counter.get(s)+1);
			else
				counter.put(s, 1);
		} while ( !s.equals("0") );

		String retStr = "";
		int max = 0;
		for ( String str : counter.keySet() ) {
			int i = counter.get(str);
			if (i > max) {
				max = i;
				retStr = str;
			}
			else if (i == max) {
				retStr += " and " + str;
			}
		}
		System.out.print("Mode is: ");
		System.out.println(retStr);

	}
}