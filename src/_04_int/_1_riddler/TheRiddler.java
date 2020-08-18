package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int scr = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String ansr1 = JOptionPane.showInputDialog("What has a head a tail that is brown and also has no legs?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (ansr1.equals("a penny")) {
	JOptionPane.showMessageDialog(null, "congrats you have beeen rewararded 1 point");
	scr++;
}
	else {
		JOptionPane.showMessageDialog(null, "Wrong");
		JOptionPane.showMessageDialog(null, "The answer was a penny");

	}

// 5. Otherwise, say "wrong" and tell them the answer
String ansr2 = JOptionPane.showInputDialog("Can you name three consecutive days without using the words\n" + 
		 " Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday?");
if (ansr2.equals("yesterday today tomorrow")) {
	JOptionPane.showMessageDialog(null, "congrats you have beeen rewararded 1 point");
	scr++;
}
	else {
		JOptionPane.showMessageDialog(null, "Wrong");
		JOptionPane.showMessageDialog(null, "The answer was yesterday today and tomorrow.");
}
String ansr3 = JOptionPane.showInputDialog("a man lives in a one story house made entirely of redwood\n" +
"what color would the stairs be?");
if (ansr3.equals("he has no stairs")) {
	JOptionPane.showMessageDialog(null, "congrats you have beeen rewararded 1 point");
	scr++;
}
	else {
		JOptionPane.showMessageDialog(null, "Wrong");
		JOptionPane.showMessageDialog(null, "Wait he had stairs?");
}

// 6. Add some more riddles
JOptionPane.showMessageDialog(null, "congrats you have "+scr+"out of 3 points");
		// 2. Make a pop up to show the score.
		if (scr==3) {
			JOptionPane.showMessageDialog(null, "Nice job you got all of them correct!");
		}
	}
}

