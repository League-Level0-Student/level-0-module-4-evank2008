package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

String op = "";
		// 1. Get 2 numbers from the user and convert them to integer.
		double total = JOptionPane.showOptionDialog(null, "Calculator", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "0","1","2","3","4","5","6","7","8","9"},
				null);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		while(true) {
		int operation = JOptionPane.showOptionDialog(null, total+op, "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "\u00f7", "x", "-", "+", "Exit" },
				null);
		switch(operation) {
		case 0:
			op="\u00f7";
			break;
		case 1:
			op="x";
			break;
		case 2:
			op="-";
			break;
		case 3:
			op="+";
			break;  
		case 4:
			System.exit(0);
			break;
		}
		int num2 = JOptionPane.showOptionDialog(null, total+op, "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "0","1","2","3","4","5","6","7","8","9"},
				null);
		op="";
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		switch(operation) {
		case 0:
			total = total/num2;
			break;
		case 1:
			total = total*num2;
			break;
		case 2:
			total = total-num2;
			break;
		case 3:
			total = total+num2;
			break;
	
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	}
	// 3. Create method for addition operation.
	static void add(int n1, int n2) {
		int sum = n1+n2;
		JOptionPane.showMessageDialog(null, n1+"+"+n2+"="+sum);
	}
	static void sub(int n1, int n2) {
		int sum = n1-n2;
		JOptionPane.showMessageDialog(null, n1+"-"+n2+"="+sum);
	}
	static void div(int n1, int n2) {
		int sum = n1/n2;
		JOptionPane.showMessageDialog(null, n1+"\u00f7"+n2+"="+sum);
	}
	static void mlt(int n1, int n2) {
		int sum = n1*n2;
		JOptionPane.showMessageDialog(null, n1+"x"+n2+"="+sum);
	}
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}