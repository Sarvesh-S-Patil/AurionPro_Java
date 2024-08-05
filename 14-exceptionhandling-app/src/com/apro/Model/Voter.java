package com.apro.Model;
import com.apro.Model.InvalidAgeException;


public class Voter {
	private int id;
	private int age;
	private String name;
	public Voter(int id, int age, String name) {
		super();
		this.id = id;
		
		this.age = age;
		this.name = name;
		if(age<18) {
			throw new InvalidAgeException();
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int oid) {
		this.id = oid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<18) {
			throw new InvalidAgeException();
		}
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Voter [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
