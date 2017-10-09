import javax.swing.JOptionPane;

public class SpudCounter {

	public SpudCounter() {
		// TODO Auto-generated constructor stub
		String potato = JOptionPane.showInputDialog("Type a number between one and eight");
		int potatos = Integer.parseInt(potato);
		if (potato.equals(1)) {
			System.out.println("1 potato");
		}
		System.out.println("1 potato");
		System.out.println("2 potato");
		System.out.println("3 potato");
		System.out.println("4");
		System.out.println("5 potato");
		System.out.println("6 potato");
		System.out.println("7 potato");
		System.out.println("more");

	}

}
