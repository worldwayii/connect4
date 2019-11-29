package grid02;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class GridView  extends JPanel{
	
private String firstUser;
private String secondUser;
private JPanel mGridPanel;
private JFrame mainFrame;
private JLabel currentStatusLabel;
private Square theSquare;


 public void init(){
//	 welcomeUser();
     mainFrame = new JFrame();
     mainFrame.setSize(500, 600);
     JPanel gameWrapper = new JPanel();
     gameWrapper.setLayout(new BoxLayout(gameWrapper, BoxLayout.PAGE_AXIS));
     currentStatusLabel = new JLabel();
     currentStatusLabel.setFont(new Font("Courier New", Font.BOLD, 20));
     gameWrapper.add(currentStatusLabel);
     mGridPanel = new JPanel();
     mGridPanel.setSize(500, 500);
     GridLayout gridLayout = new GridLayout(Grid.ARRAY_HEIGHT, Grid.ARRAY_WIDTH);
     mGridPanel.setLayout(gridLayout);

     for(int i = 0; i < Grid.ARRAY_HEIGHT; i++){
         for(int j = 0; j < Grid.ARRAY_WIDTH; j++){
             JPanel square = new JPanel();
             square.setSize(new Dimension(120, 120));
             square.setLayout(new FlowLayout());
             square.setBackground(Color.white);
             square.setBorder(BorderFactory.createDashedBorder(null, 3, 10));
             square.setBackground(Color.white);
             handleSquareClick(square, i, j);
             mGridPanel.add(square);

         }
     }
     gameWrapper.add(mGridPanel);
     mainFrame.add(gameWrapper);
     mainFrame.setVisible(true);
     currentStatusLabel.setText(" It's " + firstUser+"'s turn");
     
 }
 
 private void handleSquareClick(JPanel square,  int x,  int y) {
     square.addMouseListener(new MouseListener() {
         @Override
         public void mouseClicked(MouseEvent e) {
        	 theSquare.onSquareClicked(e.getY(), y);
        	 
            System.out.printf(e.getY() +","+ e.getX() );
           
         }

         @Override
         public void mousePressed(MouseEvent e) {}

         @Override
         public void mouseReleased(MouseEvent e) {}

         @Override
         public void mouseEntered(MouseEvent e) {}

         @Override
         public void mouseExited(MouseEvent e) {}
     });
 }
 
 
 
public void welcomeUser() {
	
	int userColorChoice;
	String choice;
	String lastChoice;
	
	String firstInput = JOptionPane.showInputDialog("Welcome, Please add First player name");
	firstUser = firstInput.toString();
	String  colourChoice = JOptionPane.showInputDialog("Please choose a disc color. Press 1 for Red and 2 for Yellow");
	userColorChoice = Integer.parseInt(colourChoice);
	if(userColorChoice == 1) {
		choice = "RED";
		lastChoice = "YELLOW";
	}else {
		choice = "YELLOW";
		lastChoice = "RED";
	}
   
	
	String secondInput = JOptionPane.showInputDialog("Welcome, Please add Second player name");
	secondUser = secondInput.toString();
	
	JOptionPane.showConfirmDialog(mGridPanel, firstUser  + " plays with " + choice +  ", and " + secondUser + " plays with " + lastChoice);
	
}



  
		 
}
