import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String  riddle = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equalsIgnoreCase("A stamp")) {
	JOptionPane.showMessageDialog(null, "correct");
	score += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong");
	JOptionPane.showMessageDialog(null, "The correct answer is a stamp");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Yor score is " + score);
		
String riddletwo = JOptionPane.showInputDialog("What has an eye but cannot see?");
if (riddletwo.equalsIgnoreCase("a needle")) {
	JOptionPane.showMessageDialog(null, "correct");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null, "wrong");
	JOptionPane.showMessageDialog(null, "The correct answer is a needle");
}
JOptionPane.showMessageDialog(null, "Your score is " + score);
	}

	private static void score(int i) {
		// TODO Auto-generated method stub
		
	}
}

