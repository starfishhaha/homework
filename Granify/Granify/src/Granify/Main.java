package Granify;
public class Main {
	public static void main(String[]args) {
		Cat cat = new Cat();
		System.out.println("Name is currently "+ cat.getName());
		cat.setName("Garfield");
		System.out.println("Name has been changed to "+ cat.getName());
		
		Data data = new Data("database");
		data.insert("Cat", cat);
	}
}
