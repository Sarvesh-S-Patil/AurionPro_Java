package com.apro.test;

import com.apro.model.Sayable;

public class SayableDemo {
	public static void main(String[] args) {
		Sayable sayable = () -> System.out.println("Inside Sayable");
		sayable.say();
	}
	
	public void display(Sayable sayable) {
		sayable.say();
	}

}
