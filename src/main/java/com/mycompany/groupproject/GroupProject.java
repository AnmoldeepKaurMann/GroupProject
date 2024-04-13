package com.mycompany.groupproject;

import java.util.Scanner;

/**
 * A simple main class to test the Blackjack game.
 * You can create players, a dealer, and start a game here.
 */
public class GroupProject {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();

            while (true) {
                // Create a BlackjackGame instance
                BlackjackGame game = new BlackjackGame("Blackjack");

                // Create players
                BlackjackPlayer player = new BlackjackPlayer(playerName, game);
                BlackjackDealer dealer = new BlackjackDealer("Dealer", game);

                // Add players to the game
                game.getPlayers().add(player);
                game.getPlayers().add(dealer);

                // Start the game
                game.play();

                // Declare winner
                game.declareWinner();

                System.out.print("\nWould you like to play again? (yes/no): ");
                String playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("yes")) {
                    break;
                }
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
