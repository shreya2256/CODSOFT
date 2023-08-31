import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int startNo = 1;
        int endNo = 100;
        
        int attempts = 5;
        int score = 0;
        
        Random random = new Random();
        int randomNumber = random.nextInt(endNo - startNo + 1) + startNo;
        
        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game !!!");
        
        for (int i = 1; i <= attempts; i++) {  // Removed the semicolon after the for loop
            String number = JOptionPane.showInputDialog("Guess the number between " + startNo + " and " + endNo + ":");
            int guessNumber = Integer.parseInt(number);
            
            if (guessNumber == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations!! You have guessed the right number: " + guessNumber + " in " + i + " attempts.");
                score = attempts - i + 1;
                break;
            } else if (guessNumber < randomNumber) {
                JOptionPane.showMessageDialog(null, "Your guess is lower than the random number. Remaining attempts: " + (attempts - i));
            } else {
                JOptionPane.showMessageDialog(null, "Your guess is higher than the random number. Remaining attempts: " + (attempts - i));
            }
        }
        
        if (score > 0) {
            JOptionPane.showMessageDialog(null, "Your score: " + score);
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, you couldn't guess the number. The correct number was: " + randomNumber);
        }
    }
}
