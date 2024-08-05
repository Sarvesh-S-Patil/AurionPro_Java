package com.apro.violation.test;

import java.util.ArrayList;

import java.util.List;

import com.apro.violation.Builder;
import com.apro.violation.Guitar;
import com.apro.violation.Inventory;
import com.apro.violation.Type;
import com.apro.violation.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addGuitar(new Guitar("1000", 5000, Builder.FENDER, "10FX",Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD));
		inventory.addGuitar(new Guitar("2000", 10000, Builder.FENDER, "20FX",Type.ELECTRIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD));
		inventory.addGuitar(new Guitar("3000", 15000, Builder.FENDER, "10FX",Type.ACOUSTIC, Wood.ALDER, Wood.CEDAR));
		inventory.addGuitar(new Guitar("1500", 35000, Builder.FENDER, "20FX",Type.ELECTRIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD));

	}

}
