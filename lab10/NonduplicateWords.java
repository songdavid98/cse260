import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class NonduplicateWords {

	public static void main(String[] args) {
		String text = "";
		try {
			Scanner sc = new Scanner( new File(args[0]) ) ;
			text = sc.useDelimiter("\\A").next();
			sc.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String[] stringarray = text.split(" ");
		
		TreeSet<String> ts = new TreeSet<String>();
		for (String s : stringarray) {
			ts.add(s);
		}
		System.out.println(ts);
	}
}