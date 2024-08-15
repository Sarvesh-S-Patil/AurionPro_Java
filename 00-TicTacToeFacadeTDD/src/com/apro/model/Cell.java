package com.apro.model;

public class Cell {
	private MarkType mark;


	public Cell(MarkType mark) {
		super();
		this.mark=mark;
	}

	public boolean isEmpty() {
		if(mark==MarkType.EMPTY)
			return true;
		return false;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) throws CellAlreadyMarkedException {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Cell [mark=" + mark + "]";
	}
	

}
