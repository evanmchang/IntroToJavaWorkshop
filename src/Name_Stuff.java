import javax.swing.JOptionPane;

public class Name_Stuff {
	public static void main(String[] args) {
		String E = "Evan";
		String F = JOptionPane.showInputDialog("Please Enter Your Name");
		if (E.equals(F)) {
			JOptionPane.showMessageDialog(null, "There shall only be one Evan!!!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Your name sucks!!");
		}

	}
}
