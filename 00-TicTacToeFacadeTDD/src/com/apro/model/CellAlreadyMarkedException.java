package com.apro.model;

public class CellAlreadyMarkedException extends RuntimeException {
	
	
	public String getMeassage() {
		return "Cell is already marked";
	}
}
