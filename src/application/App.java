package application;

public class App {

	public static void main(String[] args) {
		Database db = new Database("localhost:3306");
		
		db.getData();
		
		//At this point there is no closing of the db, and 
		//the program doesn't warn about it either
		
		/*once AutoCloseable interface is added to Database class
		 * now get a warning about a resource leak cause the db isn't closed
		 */
		
		db.close();
		//this removes the resource leak warning
	}
}
