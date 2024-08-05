package com.apro.composite.test;

import com.apro.composite.model.Component;
import com.apro.composite.model.Composite;
import com.apro.composite.model.Leaf;

public class CompositeDesignTest {
	public static void main(String[] args) {
		Component hdd = new Leaf("HDD", 8000);
		Component ssd = new Leaf("SSD", 10000);
		Component mouse = new Leaf("Mouse", 500);
		Component keyBoard = new Leaf("KeyBoard", 1000);
		
		Composite storage = new Composite("Storage");
		storage.addComponent(hdd);
		storage.addComponent(ssd);
		
		Composite peripheral = new Composite("Peripheral");
		peripheral.addComponent(mouse);
		peripheral.addComponent(keyBoard);
		
		Composite computer = new Composite("Computer");
		computer.addComponent(peripheral);
		computer.addComponent(storage);
		
		computer.showPrice();
	}

}
