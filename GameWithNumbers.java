import java.util.Random;
import java.util.Scanner;

// Press
public class GameWithNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();

        boolean isValid = true;
        int playerNumber = 0;
        int computerNumber = randomNumber.nextInt(100);

        while (true) {
            System.out.println("Guess a number (1-100):");
            String playerInput = scanner.nextLine();

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 && playerInput.charAt(i) > 57) {
                    isValid = false;
                }
                break;

            }

            if (isValid) {
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber)
                { System.out.println("You guessed it!");
                    break;}
                else if (playerNumber > computerNumber) System.out.println("Too high");
                else System.out.println("Too low");}

            else {System.out.println("Invalid input.");}
        }

        }
    }
