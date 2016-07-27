import javax.swing.JOptionPane;

public class Hello_World {
	public static void main(String[] arg) {
		System.out.print("Hello Ev");
		System.out.println("an");
		JOptionPane.showMessageDialog(null, "Hello");
		JOptionPane.showMessageDialog(null, "Someone??");
		JOptionPane.showMessageDialog(null, "I hacked your computer!");
		JOptionPane.showMessageDialog(null, "Are you deleting my messages?");
		JOptionPane.showMessageDialog(null, "GoodBye");
		String usersName = JOptionPane.showInputDialog("Enter Name");
		System.out.println("Hello" + usersName);
	}
}
