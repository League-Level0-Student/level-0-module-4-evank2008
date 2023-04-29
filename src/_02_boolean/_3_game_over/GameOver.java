package _02_boolean._3_game_over;

import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {
String input = null;
		boolean gameOver = false;
		while(gameOver==false) {
		input = JOptionPane.showInputDialog("Is the game over?");
			
				if(input.equals("yes")) {
					gameOver = true;
				}
		
		
		// 1. Ask the user if the game is over and save their answer.
		
		// 2. If they answer "yes" change gameOver to true.
		
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		
		// 4. Tell the user the game is over outside the while loop.
		
	}
JOptionPane.showMessageDialog(null, "THE END");
System.exit(0);
} }