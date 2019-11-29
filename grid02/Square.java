package grid02;

public class Square {
	
	private int number;
	private boolean empty;
	private Disc theDisc;
	private  int xLoc; 
	private  int yLoc; 
	
	
	public Square(int number) {
		setNumber(number);
		setEmpty(true);
	}
	
	public Square(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	//adds a disc to a square
	public void addDisc(Disc theDisc) {
		this.theDisc = theDisc;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	//sets a square empty
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	///likewise for the rest
	
	public void onSquareClicked(int x, int y) {
		// TODO Auto-generated method stub
		System.out.print(x+","+y);
	}

}
