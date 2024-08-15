package com.apro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;
	public ResultAnalyzer() {
		super();
		board = new Board();
	}
	
	
	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}


	public void setResult(ResultType result) {
		this.result = result;
	}


	public boolean horizontalWinCheck() {
		int counter=0;
		Cell[] cells = board.getCells();
		for(int i=0;i<3;i++) {
			boolean check = true;
			MarkType mark = cells[counter].getMark();
			if(mark ==MarkType.EMPTY)
				continue;
			for(int j=0;j<3;j++) {
				if(cells[counter].getMark()!=mark)
					check=false;
				counter++;
			}
			if(check==true)
				return true;
		}
		return false;
		
	}
	
	public boolean verticalWinCheck() {
		
		Cell[] cells = board.getCells();
		for(int i=0;i<3;i++) {
			int counter=i;
			boolean check = true;
			MarkType mark = cells[counter].getMark();
			if(mark ==MarkType.EMPTY)
				continue;
			for(int j=0;j<3;j++) {
				if(cells[counter].getMark()!=mark)
					check=false;
				counter+=3;
			}
			if(check==true)
				return true;
		}
		return false;
		
	}
	
	
	public boolean diagonalWinCheck() {
		Cell[] cells = board.getCells();
		if(cells[0].getMark()==cells[4].getMark() && cells[4].getMark()==cells[8].getMark() && cells[0].getMark()!= MarkType.EMPTY)
			return true;
		
		if(cells[2].getMark()==cells[4].getMark() && cells[4].getMark()==cells[6].getMark() && cells[4].getMark()!= MarkType.EMPTY)
			return true;
		
		return false;
	}
	
	public ResultType getResult() {
		if(verticalWinCheck() || diagonalWinCheck() || horizontalWinCheck())
			return ResultType.WIN;
		for(Cell cell : board.cells)
			if(cell.isEmpty())
				return ResultType.PROGRESS;
		return ResultType.DRAW;
	}

}
