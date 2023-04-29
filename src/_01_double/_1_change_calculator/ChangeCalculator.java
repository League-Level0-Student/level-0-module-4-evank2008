package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelString = JOptionPane.showInputDialog("How many nickels in ur pocket?");
		int nickels = Integer.parseInt(nickelString);
		String dimeString = JOptionPane.showInputDialog("How many dimes in ur pocket?");
		int dimes = Integer.parseInt(dimeString);
		String qString = JOptionPane.showInputDialog("How many quarters in ur pocket?");
		int qs = Integer.parseInt(qString);
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 
			 double money = nickels*0.05 + dimes*0.1+qs*0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
			 	JOptionPane.showMessageDialog(null, "You got $" + money + " in your pocket");
	}
}

