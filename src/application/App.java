package application;

public class App {

	public static void main(String[] args) {
		Database db;
		
		try {
			db = new Database("localhost:3306");
			db.getData();
			/*Constructors don't have any return type, but they can
			 * throw exceptions
			 */
			db.close();
			//this removes the resource leak warning
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
