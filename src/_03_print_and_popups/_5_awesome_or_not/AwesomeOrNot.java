package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
		
	
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int rick = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		
		// 3. Print your variable to the console
		System.out.println(rick);
		// 4. Get the user to enter something that they think is awesome
		String code = JOptionPane.showInputDialog("what is somthing you think is awsome?");
		// 5. If your variable is  0
		if(rick == 0) {
			JOptionPane.showMessageDialog(null, "awesome!!!!!!");
		}
		else if(rick == 1) {
			JOptionPane.showMessageDialog(null, "meh");
		}
		else if(rick == 2) {
			JOptionPane.showMessageDialog(null, "boring!");
		}
		else if(rick == 3) {
			JOptionPane.showMessageDialog(null, "you need to like diffrent things!");
		}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).
	}

}
