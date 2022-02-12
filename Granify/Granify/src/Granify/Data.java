package Granify;

public class Data {
	Data(String database){
		System.out.println("Connecting to database");
	}
	public void beginTran() {
		System.out.println("Beginning a transaction");	
	}
	public void commit() {
		System.out.println("Committing transaction");
	}
	public void rollback() {
		System.out.println("Rolling back transaction");
	}
	public void insert(String table, Cat object){
		System.out.println("Inserting " + object.getName()+ " into table " + table);
	}
	
}
