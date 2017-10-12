import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Letters {

	public static boolean isConsonant(char c) {
		String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
		return consonants.contains( Character.toString(c) );
	}

	public static void main(String[] args) {
		HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter file name:");

		String text = "";
		try {
			Scanner sc = new Scanner( new File(s.nextLine()) ) ;
			text = sc.useDelimiter("\\A").next();
			sc.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		counter.put('A',0);
		counter.put('E',0);
		counter.put('I',0);
		counter.put('O',0);
		counter.put('U',0);
		counter.put('C',0);

		text = text.toUpperCase();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			switch (c) {
				case 'A':
				counter.put('A', counter.get('A')+1 );
				break;
				case 'E':
				counter.put('E', counter.get('E')+1 );
				break;
				case 'I':
				counter.put('I', counter.get('I')+1 );
				break;
				case 'O':
				counter.put('O', counter.get('O')+1 );
				break;
				case 'U':
				counter.put('U', counter.get('U')+1 );
				break;
				default:
				if (isConsonant( c ))
					counter.put('C', counter.get('C')+1);
				break;
		
			}
			
		}
		System.out.println("Vowels: ");
		System.out.print("A: ");
		System.out.println(counter.get('A'));

		System.out.print("E: ");
		System.out.println(counter.get('E'));

		System.out.print("I: ");
		System.out.println(counter.get('I'));

		System.out.print("O: ");
		System.out.println(counter.get('O'));

		System.out.print("U: ");
		System.out.println(counter.get('U'));

		System.out.print("consonants: ");
		System.out.println(counter.get('C'));

	}
}