import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Word: ");

	    String word = scanner.nextLine();  // Read user input
	    
	    MongoHandler mongoHandler = new MongoHandler("WordsDB");
	    
	    //Check if that word exists in the DB
	    String result = mongoHandler.getWord(word);
	    
	    // if no, then ask the user for input, get the words and save that in the db
	    if(result == null) {
		    System.out.println("Word not in Database \n Kindly Update");
		    System.out.println("Enter French: ");
		    String french = scanner.nextLine();  // Read user input
		    System.out.println("Enter German: ");
		    String german = scanner.nextLine();  // Read user input
		    
		    mongoHandler.insert(word, german, french);
		    System.out.println("Word added to DB!");
	    }
	    // if yes, then get the synonyms and display to user
	    else {
	    	System.out.println(result);
	    }
	    
	    
	    
	    
		

	}

}
