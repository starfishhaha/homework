package Granify;

import java.lang.Math;
import java.util.ArrayList;

public class Cat {
	private String name;
	private int age;
	private String favoriteFood;
	
	int times = 0;
	ArrayList<String> list = new ArrayList<String>();
	
	Cat(){
		this.name = "";
		this.age = (int) (Math.random()*(11-5+1) + 5);
		this.favoriteFood = "";	
	}
	//Constructor overloading for optional initial name for new cat
	Cat(String name){
		this.name = name;
		this.age = (int) (Math.random()*(11-5+1) + 5);
		this.favoriteFood = "";
	}
	public String getName() {
		return this.name;
	}
	//get names method
	public ArrayList<String> getNames(){
		return list;
	}
	public int getAge() {
		if(times/5 == 0) {
			this.age++;
			times = 0;
		}
		return this.age;
	}
	public String getFavoriteFood() {
		return this.favoriteFood;
	}
	public void setName(String newName) {
		list.add(newName);
		this.name = newName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setFavoriteFood(String newFavoriteFood) {
		this.favoriteFood = newFavoriteFood;
	}
	// speak method
	public void speak() {
		System.out.println("Meow");
		times++;
	}
	//method overloading for speak
	public void speak(String argument) {
		System.out.println(argument);
		times++;
	}
	public double getAverageNameLength() {
		double length = 0;
		for(String i: list) {
			length += i.length();
		}
		return length/list.size();
	}
	
	
}
