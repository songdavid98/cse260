import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class CountOccurenceOfWords{

	public static void main(String[] args) {
		HashMap<String, Integer> counter = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name:");

		String text = "";
		try {
			Scanner s = new Scanner( new File(sc.nextLine()) ) ;
			text = s.useDelimiter("\\A").next();
			sc.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		text = text.toUpperCase();
		String[] stringarray = text.split("[\"(),;,:?\\s+]+");

		for (String str : stringarray) {
			if (counter.containsKey(str))
				counter.put( str , counter.get(str)+1 );
			else
				counter.put(str, 1);
		}

		ArrayList<WordOccurrence> list = new ArrayList<WordOccurrence>();
		for ( String str : counter.keySet() ) {
			WordOccurrence w = new WordOccurrence( str, counter.get(str) );
			list.add(w);
		}
		Collections.sort( list );
		System.out.println(list);
	}
}