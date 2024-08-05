package com.apro.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	String name;
	List<Component> components; 
	public Composite(String name) {
		super();
		this.name = name;
		components = new ArrayList<Component>();
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void showPrice() {
		System.out.println(name+" - ");
		for(Component component : components)
			component.showPrice();
		
	}
	

}
