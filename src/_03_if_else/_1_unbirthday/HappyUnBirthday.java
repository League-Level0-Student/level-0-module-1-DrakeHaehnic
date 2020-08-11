package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class HappyUnBirthday {
public static void main(String[] args) {
	String bday = JOptionPane.showInputDialog("when is you birthday");
	if (bday.equals("8/10")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "Then i wish you a very happy UNbirthday");
	}
}
}
