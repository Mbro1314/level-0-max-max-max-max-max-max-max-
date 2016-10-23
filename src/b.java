import javax.swing.JOptionPane;

public class b {

	// Copyright Wintriss Technical Schools 2013

	public static void main(String[] args) {

		// 1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("Do you like bananas?");

		// 2. if they say no,
		if (answer.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are sooooo crazy!!!!!");

		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		// ask them what is their favorite hobby
		else {
			String hobby = JOptionPane.showInputDialog("what is your favorite hobby");
			// show a pop up that says "<your hobby> is much better with
			// bananas!"
			JOptionPane.showMessageDialog(null, hobby + " is much better then bananas");

			// 4. OPTIONAL: if they say something other than “yes” or “no”
			// show a pop up that says “You are bananas!”
		}
	}

}
