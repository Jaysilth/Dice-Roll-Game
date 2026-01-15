
import java.util.Random;   // Used to generate random dice values
import java.util.Scanner;  // Used to read user input

public class Main {

    public static void main(String[] args) {
        // Java Dice Roller Program

        // Create Scanner object for reading input from the user
        Scanner scanner = new Scanner(System.in);

        // Create Random object for generating dice rolls
        Random random = new Random();

        // Stores how many dice the user wants to roll
        int numOfDice;

        // Stores the total sum of all dice rolls
        int total = 0;

        // Ask the user for number of dice
        System.out.print("Enter the number of dice you want to roll: ");
        numOfDice = scanner.nextInt();

        // Check that the number of dice is valid
        if (numOfDice > 0) {

            // Loop once for each die
            for (int i = 0; i < numOfDice; i++) {

                // Generate a random number between 1 and 6
                int roll = random.nextInt(1, 7);

                // Print ASCII art representation of the die
                printDie(roll);

                // Display the rolled value
                System.out.println("You rolled: " + roll);

                // Add roll value to total
                total = total + roll;
            }

            // Display the total of all dice rolls
            System.out.println("Total: " + total);

        } else {
            // Handle invalid input
            System.out.println("Number of dice must be greater than 0");
        }

        // Close scanner to free system resources
        scanner.close();
    }

    // Prints an ASCII art die based on the rolled value
    static void printDie(int roll) {

        // Dice face for roll = 1
        String dice1 = """
                  ------
                 |      |
                 |  ●   |
                 |      |
                  ------
                """;

        // Dice face for roll = 2
        String dice2 = """
                  ------
                 | ●    |
                 |      |
                 |    ● |
                  ------
                """;

        // Dice face for roll = 3
        String dice3 = """
                  ------
                 | ●    |
                 |   ●  |
                 |     ●|
                  ------
                """;

        // Dice face for roll = 4
        String dice4 = """
                  ------
                 | ●  ● |
                 |      |
                 | ●  ● |
                  ------
                """;

        // Dice face for roll = 5
        String dice5 = """
                  ------
                 | ●   ● |
                 |   ●   |
                 | ●   ● |
                  ------
                """;

        // Dice face for roll = 6
        String dice6 = """
                  ------
                 | ●  ● |
                 | ●  ● |
                 | ●  ● |
                  ------
                """;

        // Print the correct die based on roll value
        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
