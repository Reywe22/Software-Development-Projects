import java.util.*;
//I did the assignment again this time without the use of chatgpt, I used the links that were previousl
public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] wordBank = {
            "cane", "me", "rich", "girl", "era",
            "music", "phone", "steep", "board", "sleep",
            "dinner", "pizza", "gaming", "compete", "player",
            "surfing", "glory", "eating", "brushing", "running"
        };

        int wins = 0;
        int losses = 0;
        boolean continuePlaying = true;

        while (continuePlaying) {
            String word = wordBank[random.nextInt(wordBank.length)];
            int lives = 6;
            char[] currentWordState = new char[word.length()];
            Arrays.fill(currentWordState, '_');
            Set<Character> incorrect = new HashSet<>();

            while (lives > 0) {
                System.out.println("Word: " + String.valueOf(currentWordState));
                System.out.println("Incorrect Guesses: " + incorrect);
                System.out.println("Attempts Left: " + lives);

                System.out.print("Enter a lowercase letter: ");
                char input = scanner.next().charAt(0);

                if (!Character.isLetter(input) || !Character.isLowerCase(input)) {
                    System.out.println("Please enter a valid lowercase letter.");
                    continue;
                }

                if (incorrect.contains(input) || Arrays.toString(currentWordState).contains(String.valueOf(input))) {
                    System.out.println("You've already guessed that letter. Try again.");
                    continue;
                }

                boolean correct = false;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == input) {
                        currentWordState[j] = input;
                        correct = true;
                    }
                }

                if (!correct) {
                    lives--;
                    incorrect.add(input);
                    System.out.println("Incorrect guess! Your attempts left: " + lives);
                }

                if (Arrays.equals(word.toCharArray(), currentWordState)) {
                    System.out.println("Congrats! You guessed the word: " + word);
                    wins++;
                    break;
                }
            }

            if (lives == 0) {
                System.out.println("Sorry, you lost because you ran out of attempts. The word was: " + word);
                losses++;
            }

            System.out.println("Wins: " + wins + " Losses: " + losses);
            System.out.print("Do you want to play again? (Yes/No): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                continuePlaying = false;
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
