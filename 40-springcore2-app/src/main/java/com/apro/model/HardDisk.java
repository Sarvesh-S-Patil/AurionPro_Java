package com.apro.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	@Value("60")
	private int capacity;

	
	
	public HardDisk() {
		super();
		System.out.println("Inside Constructor");
		// TODO Auto-generated constructor stub
	}

	public HardDisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		System.out.println("Inside Setter");
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "HardDisk [capacity=" + capacity + "]";
	}
	
	

}
