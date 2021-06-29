/**
 * Main
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean playing = true;
        int number = (int)(Math.random()*101);
        int numGuess = 0;
        System.out.println("Guess a number between 1-100");

        while (playing){
           int guess = input.nextInt();
            if(guess < number){
                System.out.println("Guess is too low");
            } else if (guess > number){
                System.out.println("Guess is too high");
            } else if (guess == number){
                System.out.println("You guessed it!");
                playing = false;
            } else {
                System.out.println("Error of some kind.");
            }

            if(numGuess == 9){
                System.out.println("Failed to guess the number. You lose.");
                playing = false;
            } else {
                numGuess++;
                System.out.println("Number of guesses left: " + (10-numGuess));
            }
        }
        input.close();
    }
    
}