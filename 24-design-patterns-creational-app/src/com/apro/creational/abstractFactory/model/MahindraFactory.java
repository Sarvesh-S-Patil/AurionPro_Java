package com.apro.creational.abstractFactory.model;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICar make() {
		// TODO Auto-generated method stub
		return new MahindraCar();
	}

}
