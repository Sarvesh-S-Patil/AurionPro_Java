package com.apro.decorator2.test;

import com.apro.decoator2.model.GoldenHat;
import com.apro.decoator2.model.IHat;
import com.apro.decoator2.model.RibonnedHat;
import com.apro.decoator2.model.StandardHat;

public class HatTest {
	
	public static void main(String[] args) {
		IHat hat = new StandardHat();
		System.out.println("Price of Standard hat : "+hat.getPrice());
		hat=new GoldenHat(hat);
		System.out.println("Price of Standard  Golden hat : "+hat.getPrice());
		hat = new RibonnedHat(hat);
		System.out.println("Price of Standard Golden hat with ribbons  "+hat.getPrice());
	}

}
