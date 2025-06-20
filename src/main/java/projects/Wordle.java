package projects;

import java.util.Scanner;

public class Wordle {
    private String secretWord;
    private int attempts;

    //add a constructor
    public Wordle(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
    }

    /*method, implement the game loop that allows the user to guess the secret word until the maximum number of attempts is reached or the secret word is guessed correctly.*/
    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while (remainingAttempts > 0) {
            System.out.println("Attempts remaining: " + remainingAttempts);
            System.out.println("Enter your best guess: ");
            String guess = scanner.nextLine();

            if (guess.length() != secretWord.length()) {
                System.out.println("Invalid guess. Please try to guess a word the same length as the secret word ");
            }

            int correctChars = 0;
            int correctPositions = 0;

            for (int i = 0; i < secretWord.length(); i++) {
                char c = guess.charAt(i);
                if (c == secretWord.charAt(i)) {
                    correctPositions++;
                } else if (secretWord.indexOf(c) >= 0) {
                    correctChars++;
                }
            }

            if (correctPositions == secretWord.length()) {
                System.out.println("Jackpot! You guessed correctly: " + secretWord);
                break;
            } else {
                System.out.println("Correction character: " + correctChars);
                System.out.println("Correct position at: " + correctPositions);
            }
        }
        if (remainingAttempts == 0) {
            System.out.println("Sorry you're out of the game. The secret word was " + secretWord);

        }
    }
}
