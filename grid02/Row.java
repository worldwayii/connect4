package grid02;

import java.util.ArrayList;

public class Row {

	private int number;
	private ArrayList <Square> theRow = new ArrayList <Square> ();
	
	public Row(int number) {
		Square tempSquare;
		setNumber(number);
		for(int loop = 1; loop < 5; loop++) {
			tempSquare = new Square(loop);
			this.theRow.add(tempSquare);
		}
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public Square get(int yLoc) {
		// TODO Auto-generated method stub
		return null;
	}
}
