//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/

public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String grace = "tennis";
String emerson = "magical abilities";
String sofia = "eating";
String priyankaa = "flexibility";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Whats your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered.
if (name.equalsIgnoreCase("grace")) {
	JOptionPane.showMessageDialog(null, "Your superpower is " + grace);
}
if (name.equalsIgnoreCase("emerson")) {
	JOptionPane.showMessageDialog(null, "Your superpower is " + emerson);
}
if (name.equalsIgnoreCase("sofia")) {
	JOptionPane.showMessageDialog(null, "Your superpower is " + sofia);
}
if (name.equalsIgnoreCase("priyankaa")) {
	JOptionPane.showMessageDialog(null, "Your superpower is " + priyankaa);
}
else{
	JOptionPane.showMessageDialog(null, "Sorry that name does not have a superpower");
}
}
}




