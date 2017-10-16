import javax.swing.JOptionPane;

public class SpudCounterTwo {
	public static void main(String[] args) {
		String potato = JOptionPane.showInputDialog("Choose a number between one and eight");
		int potatonum = Integer.parseInt(potato);
		for (int i = 1; i <= potatonum; i++) {
			if (i == 4) {
				System.out.println(4);
			} else if (i == 8) {
				System.out.println("more");
			} else {
				System.out.println(i + " potato");

			}
		}

	}
}
