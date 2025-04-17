package week7;

public class Pet {

	String name;
	String type;
	int age;
	String color;
	
	Pet(String name, String type){
		
		this(name, type, 0, "미정");
		
	}
	Pet(String name, String type, int age){
		this(name, type, age, "미정");
		
	}
	Pet(String name, String type, int age, String color){
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
		
	}
}
