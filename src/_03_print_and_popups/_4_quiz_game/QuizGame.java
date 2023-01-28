package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int userScore = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
		String code = JOptionPane.showInputDialog("Wich ocean is of the coast of Califonia?");
		
		if( code.equalsIgnoreCase("the pacific")) {
			userScore++;
		}
		code = JOptionPane.showInputDialog("What is the capital of california?");
			
		if( code.equalsIgnoreCase("sacramento")) {
			userScore++;
		}
		code = JOptionPane.showInputDialog("How many days are in a year?");
		
		if( code.equalsIgnoreCase("365")) {
			userScore++;
		}
        code = JOptionPane.showInputDialog("What angle is the earths axis tilted?");
		
		if( code.equalsIgnoreCase("23.5 degrees")) {
			userScore++;
		}
		code = JOptionPane.showInputDialog("What does the d in d-day stand for?");
			
		if( code.equalsIgnoreCase("day")) {
			userScore++;
		}
		code = JOptionPane.showInputDialog("How many moons does saturn have?");
		
		if( code.equalsIgnoreCase("83")) {
			userScore++;
		}
				// 2.  Ask the user a question 
				
		JOptionPane.showMessageDialog(null, "Score: "+ userScore);		// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
