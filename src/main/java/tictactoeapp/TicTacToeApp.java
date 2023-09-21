package tictactoeapp;

import java.util.Scanner;

public class TicTacToeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Allows for continuous playing
		boolean doYouWannaPlay = true;

		// Set up the tokens
		while (doYouWannaPlay) {
			System.out.println("Welcome to Tic-Tac-Toe! You are about to play a game. Are you " +
					"ready? \n But first pick which characters we will be playing.");
			System.out.println();
			System.out.println("Enter a single character that will represent you on the board.");
			char playerToken = sc.next().charAt(0);

			System.out.println("Enter a single character that will represent your opponent on the" +
					" board");

			char aiToken = sc.next().charAt(0);

			TicTacToe game = new TicTacToe(playerToken, aiToken);
			AI ai = new AI();

			// Set up the game

			System.out.println();
			System.out.println("Now we can start the game. \nTo play enter a number and your " +
					"token will be put there");
			TicTacToe.printIndexBoard();


			while (game.gameOver().equals("notOver")) {
				if (game.currentMarker == game.userMarker) {
					System.out.println();
					System.out.println("It's your turn. Enter a spot for your token");

					int spot = sc.nextInt();

					while (!game.playTurn(spot)) {
						System.out.println("Please try again. " + spot + " is already taken or " +
								"out of range.");
						spot = sc.nextInt();
					}
					System.out.println("You picked " + spot);
				} else {
					System.out.println();
					System.out.println("It's my turn");
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I picked " + aiSpot + " !");
				}

				game.printBoard();
			}

			System.out.println();
			System.out.println(game.gameOver());
			System.out.println();
			System.out.println("Do you want to play a new game? Enter 'Y' or 'N'");
			char response = sc.next().charAt(0);

			if (response == 'N') {
				System.out.println("See you soon!");
				sc.close();
			}

			doYouWannaPlay = (response == 'Y');

			System.out.println();
			System.out.println();
		}
	}
}
