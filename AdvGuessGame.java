import java.util.Random;
import javax.swing.JOptionPane;
public class AdvGuessGame {

    public static void main(String[] args) 
    {
        Random random = new Random();

        int guess;
        int attempts = 0;
        
        JOptionPane.showMessageDialog(null, "Oyaaa Welcome To The Number Guessing Game");

        int min = Integer.parseInt(JOptionPane.showInputDialog("Enter your minimum number: "));

        int max = Integer.parseInt(JOptionPane.showInputDialog("Enter your maximum number: "));

        int randomNumber = random.nextInt(min, max + 1);
       
        JOptionPane.showMessageDialog(null,
              "Guess a number between " + min + " and " + max);
        do {
            guess = Integer.parseInt(
                JOptionPane.showInputDialog("Enter a Guess: ")
            );
            attempts++;

            if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "TOO LOW🤡! Try Again");
            } else if (guess > randomNumber) {
                JOptionPane.showMessageDialog(null, "TOO HIGH🤡! Try Again");
            } else {
                JOptionPane.showMessageDialog(null, "Lucky Bastard!!\nNumber of attempts: " + attempts);

            }

        } while (guess != randomNumber);
 
        JOptionPane.showMessageDialog(null, "Game Over!");
        JOptionPane.showMessageDialog(null, "Enda Uoge!");
    }
}
