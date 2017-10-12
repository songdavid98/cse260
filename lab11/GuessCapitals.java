import java.util.HashMap;
import java.util.Scanner;

public class GuessCapitals {

	public static void main(String[] args) {
		HashMap<String, String> capitals = new HashMap<String, String>();

		capitals.put("Alabama", "Montgomery");
		capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");
        capitals.put("California", "Sacramento");
        capitals.put("Colorado", "Denver");
        capitals.put("Connecticut", "Hartford");
        capitals.put("Delaware", "Dover");
        capitals.put("Florida", "Tallahasse");
        capitals.put("Georgia", "Atlanta");
        capitals.put("Hawaii", "Honolulu");
        capitals.put("Idaho", "Boise");
        capitals.put("Illinois", "Springfield");
        capitals.put("Indiana", "Indianapolis");
        capitals.put("Iowa", "Des Moines");
        capitals.put("Kansas", "Topeka");
        capitals.put("Kentucky", "Frankfort");
        capitals.put("Louisiana", "Baton Rouge");
        capitals.put("Maine", "Augusta");
        capitals.put("Maryland", "Annapolis");
        capitals.put("Massachusettes", "Boston");
        capitals.put("Michigan", "Lansing");
        capitals.put("Minnesota", "Saint Paul");
        capitals.put("Mississippi", "Jackson");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Montana", "Helena");
        capitals.put("Nebraska", "Lincoln");
        capitals.put("Nevada", "Carson City");
        capitals.put("New Hampshire", "Concord");
        capitals.put("New Jersey", "Trenton");
        capitals.put("New York", "Albany");
        capitals.put("New Mexico", "Santa Fe");
        capitals.put("North Carolina", "Raleigh");
        capitals.put("North Dakota", "Bismark");
        capitals.put("Ohio", "Columbus");
        capitals.put("Oklahoma", "Oklahoma City");
        capitals.put("Oregon", "Salem");
        capitals.put("Pennslyvania", "Harrisburg");
        capitals.put("Rhode Island", "Providence");
        capitals.put("South Carolina", "Columbia");
        capitals.put("South Dakota", "Pierre");
        capitals.put("Tennessee", "Nashville");
        capitals.put("Texas", "Austin");
        capitals.put("Utah", "Salt Lake City");
        capitals.put("Vermont", "Montpelier");
        capitals.put("Virginia", "Richmond");
        capitals.put("Washington", "Olympia");
        capitals.put("West Virginia", "Charleston");
        capitals.put("Wisconsin", "Madison");
        capitals.put("Wyoming", "Cheyenne");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a state name. Mind the capitalization");
        String input = sc.nextLine();
        if (capitals.containsKey( input ) )
        	System.out.println(capitals.get(input));
        else
        	System.out.println("You can't spell. Goodbye");
    }	
}