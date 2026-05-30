package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int userScore = 0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question
				
				// 3.  Use an if statement to check if their answer is correct
		String ans144 = JOptionPane.showInputDialog("12*12?");
		
		if (ans144.equals("144")) {
			userScore += 1; 
			JOptionPane.showMessageDialog(null, "True");
		} else {
			userScore -= 1;
			JOptionPane.showMessageDialog(null, "False");
		}
		
		String ans9 = JOptionPane.showInputDialog("3*3?");
		
		if (ans9.equals("9")) {
			userScore += 1; 
			JOptionPane.showMessageDialog(null, "True");
		} else {
			userScore -= 1;
			JOptionPane.showMessageDialog(null, "False");
		}
		
		String ans100 = JOptionPane.showInputDialog("10*10?");
		
		if (ans100.equals("100")) {
			userScore += 1; 
			JOptionPane.showMessageDialog(null, "True");
		} else {
			userScore -= 1;
			JOptionPane.showMessageDialog(null, "False");
		}
		
		JOptionPane.showMessageDialog(null, "You scored " +userScore+ " points");


				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
