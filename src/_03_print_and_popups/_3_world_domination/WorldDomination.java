package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("DO YOU KNOW HOW TO WRITE CODE");
		// 2. If they say "yes", tell them they will rule the world.
		if( code.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "you will RULE the world");
		}else {
			JOptionPane.showMessageDialog(null, "SIGN UP FOR CLASSES AT THE LEAGUE! NOW!! ");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

