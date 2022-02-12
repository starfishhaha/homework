package Granify;

import java.util.ArrayList;

public class Dog extends Cat{
	
	int times = 0;
	ArrayList<String> list = new ArrayList<String>();
	
	Dog(){
		super();
	}
	Dog(String name){
		super(name);
	}
	public String getName() {
		return super.getName();
	}
	public ArrayList<String> getNames(){
		return list;
	}
	public int getAge() {
		if(times%5 == 0) ;
		return super.getAge()+1;
	}
	public String getFavoriteFood() {
		return super.getFavoriteFood();
	}
	public void setName(String newName) {
		list.add(newName);
		super.setName(newName); 
	}
	public void setAge(int newAge) {
		super.setAge(newAge);
	}
	public void setFavoriteFood(String newFavoriteFood) {
		super.setFavoriteFood(newFavoriteFood);
	}
	public void speak() {
		System.out.println("Woof");
		super.times++;
	}
	//method overloading for speak
	public void speak(String argument) {
		System.out.println(argument);
		super.times ++;
	}
}
