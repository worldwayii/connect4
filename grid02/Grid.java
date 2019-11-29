package grid02;

import java.awt.Graphics;

public class Grid {
	
String player1;
String player2;
private int lastXPosition = -1, lastYPosition = -1;

public static final int ARRAY_WIDTH = 7;
public static final int ARRAY_HEIGHT = 6;
int [] [] theGrid = new int[ARRAY_HEIGHT] [ARRAY_WIDTH];

	
	
	public Grid() {
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		
		
		for(int outerLoop  = 0; outerLoop < ARRAY_HEIGHT; outerLoop++) {
			for(int innerLoop = 0; innerLoop < ARRAY_WIDTH; innerLoop++) {
				System.out.print(theGrid[outerLoop] [innerLoop] +" ");
				
			}//end inner loop
			System.out.println(" ");
			
		}//end outer for loop
		
	}

	public void getGridView() {  
		this.getGridView();
			 
	}
	


	


}
