package com.exercise11oop.app;
import com.exercise11oop.model.Cat;
import com.exercise11oop.model.Angora;
import com.exercise11oop.model.Persa;
public class CatApp {
	public static void main(String[] args) {
		/*Cat michi = new Cat();
		michi.setId(1);
		michi.setName("Michi");
		michi.setAge(10);
		
		System.out.println(michi.ToString());
		*/
		Cat michi = new Persa();
		michi = new Angora();
		
		Angora tom = new Angora(2, "Tom", 4, 55.3);
		System.out.println(tom.ToString());
	}
}
