import javax.swing.JOptionPane;

public class MadLibs {
	public static void main(String[] arg) {
		String Name = JOptionPane.showInputDialog("Enter a Name");
		String Noun = JOptionPane.showInputDialog("Enter a Noun");
		String Verb = JOptionPane.showInputDialog("Enter a Verb");
		String Ajective = JOptionPane.showInputDialog("Enter an Ajective");

		System.out.println("One Day, " + Name + " went to plant a " + Noun + ". He/She threw the " + Noun
				+ " so fast that it " + Verb + " into the " + Ajective + " Ocean.");

	}
}
