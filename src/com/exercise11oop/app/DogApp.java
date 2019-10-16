package com.exercise11oop.app;
import com.exercise11oop.model.Dog;

public class DogApp {
	public static void main(String[] args) {
		Dog pluto = new Dog();	
		pluto.age = 15;
		pluto.height = 50;
		pluto.id = 10;
		
		Dog firulais = new Dog(1, "Firulais", "Labrador", 5,60.0);
		
		System.out.println("Firulais age: "+firulais.age);
		System.out.println("Firulais height: "+firulais.height);
		System.out.println("Firulais id: "+firulais.id);
	}
}
