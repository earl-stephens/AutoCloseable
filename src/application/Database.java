package application;

public class Database {
	private String connectionString;
	/* when connecting to a DB, usually have a connection string
	 * that has the info for connecting to the DB.  And usually have 
	 * a close method to close the connection as well.
	 */
	
	public Database(String connectionString) {
		System.out.println("Opening connection to " + connectionString);
		this.connectionString = connectionString;
	}
	
	public void getData() {
		System.out.println("Getting data from " + connectionString);
	}
	
	public void close() {
		System.out.println("Closing connection....");
	}
	
}
