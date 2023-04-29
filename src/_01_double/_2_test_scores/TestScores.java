package _01_double._2_test_scores;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class TestScores {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String scoreString = JOptionPane.showInputDialog("What was your latest test score? As a decimal");
		double score = Double.parseDouble(scoreString);
		
		// Convert their answer to an int.   Hint: Integer.parseInt()  
if(score>1) {
	JOptionPane.showMessageDialog(null, "wow great score!");
}
else {
	JOptionPane.showMessageDialog(null, " L bozo");
}
		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 
			 
	}
}

