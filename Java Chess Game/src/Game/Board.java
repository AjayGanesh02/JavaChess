package Game;
import java.awt.*;
import javax.swing.*; 


public class Board  {
	
	private static void createWindow() {
		
		//Creates the window and closes the app on exiting the window
		JFrame frame = new JFrame("Java Chess"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//Makes a label introducing the game
		JLabel textLabel = new JLabel("Welcome to Java Chess!",SwingConstants.CENTER); 
		textLabel.setPreferredSize(new Dimension(300, 100)); 
		
		//Displays the label in the window
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		
		//Display the window
		frame.setLocationRelativeTo(null); 
		
		//Sets window size according to what's in it
		frame.pack(); 
		
		frame.setVisible(true); 
		
	} 
	
	public static void main(String[] args) {
		createWindow();
		} 
	
	
	
	
}
