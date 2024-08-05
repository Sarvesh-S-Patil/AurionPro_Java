package com.apro.model;

public  class Demo {
	int a=1;
	static int b=1;
	int c=1;
	public Demo() {
		System.out.println("I am here ");
	}
	
	public void increment() {
		a++;
		b++;
		c++;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a +", b=" +b+", c=" + c + "]";
	}
	
	{
		System.out.println("Bye");
	}
	
	
}
