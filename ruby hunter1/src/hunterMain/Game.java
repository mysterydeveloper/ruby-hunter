// The entry point of the game.
// This class loads up a JFrame window and
// puts a GamePanel into it.

package hunterMain;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("RUBY HUNTER");//creates a JFrame
		
		window.add(new GamePanel());//add gameplanel
		
		window.setResizable(false);//the user wont be able to change the size of the JFrame
		window.pack();
		
		window.setLocationRelativeTo(null);//set the location to the middle
		window.setVisible(true);//setting it to be able to seen
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//if it closes use the default JFrame close method
		
	}
	
} 
