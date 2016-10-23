import javax.swing.JOptionPane;

public class happyornot {
	public static void main(String[] args) {

		String yes = JOptionPane.showInputDialog(null, "are you happy ");
		if (yes.equals("yes"))
			JOptionPane.showMessageDialog(null, "keep doing what ever you are doing ");
		else {
			String ono = JOptionPane.showInputDialog(null, "do you want to be happy ");

			if (ono.equals("yes"))
				JOptionPane.showMessageDialog(null, "change something");
			else {
				JOptionPane.showMessageDialog(null, "keep doing what ever you are doing ");
			}
		}
	}
}