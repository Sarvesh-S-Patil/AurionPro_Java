package com.apro.model;

import java.util.Arrays;

public class Board {
	Cell[] cells ;

	public Board() {
		super();
		this.cells = new Cell[9];
		for(int i=0;i<cells.length;i++) {
			cells[i]= new Cell(MarkType.EMPTY);
		}
		System.out.println(Arrays.toString(cells));
		System.out.println("---------");
	}
	
	public Cell[] getCells() {
		return cells;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

	public boolean isFull() {
		for(Cell cell : cells ) {
			if(cell.isEmpty())
				return false;
		}
		return true;
	}
	
	public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException {
		cells[loc].setMark(mark);
	}

	public void printBoard() {
	    int counter = 0;
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            MarkType mark = cells[counter].getMark();
	            if (mark == MarkType.EMPTY) {
	                System.out.print("   "); 
	            } else {
	                System.out.print(" " + mark + " ");  
	            }
	            if (j < 2) {
	                System.out.print("|");  
	            }
	            counter++;
	        }
	        System.out.println();
	    }
	}

}
