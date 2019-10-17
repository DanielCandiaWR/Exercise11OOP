package com.exercise11oop.model;

public class Angora extends Cat{
	//properties
	private double mouthLong;
	
	//Constructors
	public Angora() {
	}
	public Angora(int id, String name, int age) {
		super(id, name, age);
	}
	public Angora(int id, String name, int age, double mouthLong) {
		super(id, name, age);
		this.mouthLong = mouthLong;
	}
	//Getters and Setters
	public double getMouthLong() {
		return mouthLong;
	}
	public void setMouthLong(double mouthLong) {
		this.mouthLong = mouthLong;
	}
	
	@Override
	public String ToString() {
		return "Id: ["+getId()+"], name: ["+getName()+"], age: ["+getAge()+"], mouthLong: ["+mouthLong+"]";
	}
	@Override
	public void Meow() {
		
	}
	@Override
	public void Scratch() {
		
	}
}
