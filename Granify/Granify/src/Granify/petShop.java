package Granify;

public class petShop {
	public static void saveTest() {
		Cat A = new Cat("A");
		Dog B = new Dog("B");
		Data data = new Data("database");
		data.insert("database", A);
		data.insert("database", B);
	}
	public static void savePetShop() {
		Cat C = new Cat("C"); 
		Cat D = new Cat("D"); 
		Cat E = new Cat("E"); 
		Dog F = new Dog("F");
		Dog G = new Dog("G");
		Dog H = new Dog("H");
		
		Data data = new Data("database");
		data.insert("database", C);
		data.insert("database", D);
		data.insert("database", E);
		data.insert("database", F);
		data.insert("database", G);
		data.insert("database", H);
	}
	public static void logStats() {
		try{
			saveTest();
			savePetShop();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[]args) {
		logStats();
		
	}
}
