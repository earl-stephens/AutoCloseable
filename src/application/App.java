package application;

public class App {

	public static void main(String[] args) {
		Database db = new Database("localhost:3306");
		
		db.getData();
		
		//At this point there is no closing of the db, and 
		//the program doesn't warn about it either
		
		
	}
}
