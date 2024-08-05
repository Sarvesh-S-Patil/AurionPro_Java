package com.apro.adapter.model;

public class HatAdapter implements IItem {
	Hat hat;

	@Override
	public String getName() {
		return hat.getShortName()+" : "+ hat.getLongName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getBasicPrice()+hat.getTax();
	}

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	

}
