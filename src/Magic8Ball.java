
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		int Random = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.print(int.class);
		// 4. Get the user to enter a question for the 8 ball
		String question = JOptionPane.showInputDialog("Enter a Question for the 8 ball");
		int x = 0;
		int y = 1;
		int z = 2;
		int a = 3;
		// 5. If the random number is 0
		if (Random == 0) {
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// 6. If the random number is 1
		if (Random == 1) {
			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "No");
		}
		// 7. If the random number is 2
		if (Random == 2) {
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		// 8. If the random number is 3
		if (Random == 3) {
			// -- write your own answer
			JOptionPane.showMessageDialog(null, "Bad question, write your own answer!!");
		}

	}
}
