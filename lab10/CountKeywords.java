import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

public class CountKeywords {

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
		String[] stringarray = text.split("\\s+");
		

		HashSet<String> keywords =  new HashSet<String>( 
			Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", 
				"class", "continue", "default", "do", "double", "else", "enum", "extends", "final", 
				"finally", "float", "for", "if", "implements", "import", "instanceof", "int", "interface",
				"long", "native", "new", "package", "private", "protected", "public", "return", "short", "static",
				"strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient",
				"try", "void", "volatile", "while"));
		int counter = 0;

		for (String s : stringarray) {
			if (keywords.contains(s))
				counter++;
		}
		System.out.println(counter);

	}
}