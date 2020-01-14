import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	static int numofPlayers;
	static ArrayList<Player> playerList;
	static Player p1, p2, p3, p4;
	static int totalGemAmount;
	static int greenCount, whiteCount, blueCount, blackCount, redCount, goldCount;
	static int noblesCount;
	static ArrayList<Card> deckOne, deckTwo, deckThree;
	static boolean finalRound = true;
	
	static boolean redAvailable = true;
	static boolean blueAvailable = true;
	static boolean greenAvailable = true;
	static boolean whiteAvailable = true;
	static boolean blackAvailable = true;
	static boolean goldAvailable = true;
	

	public Game() {
		numofPlayers = 1;
		totalGemAmount = 0;
		playerList = new ArrayList<Player>();
		noblesCount = 10;
//		firstDeck();
//		secondDeck();
//		thirdDeck();
	}

	public static void main(String[] args) {
		// set up new game
		Game Splendor = new Game();
		Splendor.setPlayerCount();
		Splendor.setGemAmount();
		Splendor.setNobleCount();
		Splendor.initialMessage();
		Splendor.playerTurn();

		// starts round and continues until someone obtains 15+ points
		while (!finalRound) {

		}
	}
/**
 * prints initial message that contains initial token & noble card amount 
 */
	public void initialMessage() {
		System.out.print("Total Number of Red/Blue/Green/White/Black Tokens will be " + greenCount + "\n");
		System.out.print("Total Number of Gold Tokens will be " + goldCount + "\n");
		System.out.print("Total Number of Noble Cards will be " + noblesCount + "\n");
		System.out.println();
	}

	/**
	 * Asks user for PlayerCount and adds that number of players to the Arraylist playerList
	 */
	public void setPlayerCount() {
		Scanner stdIn = new Scanner(System.in);
		p1 = new Player();
		playerList.add(p1);

		System.out.println("Welcome to the game of Splendor!");
		System.out.print("How many players will be playing? (2-4 players recommended) ");
		int playerCount = stdIn.nextInt();
		System.out.println();
		while (!(playerCount >= 2 && playerCount <= 4)) {
			System.out.print("Sorry, not a valid number (2-4). Please try again ");
			playerCount = stdIn.nextInt();
		}
		if (numofPlayers < playerCount) {
			p2 = new Player();
			playerList.add(p2);
			numofPlayers++;
		}
		if (numofPlayers < playerCount) {
			p3 = new Player();
			playerList.add(p3);
			numofPlayers++;
		}
		if (numofPlayers < playerCount) {
			p4 = new Player();
			playerList.add(p4);
			numofPlayers++;
		}
	}

	public int getPlayerCount() {
		return numofPlayers;
	}

	/**
	 * Sets up initial gems/token amount based on number of players
	 */
	public void setGemAmount() {
		if (numofPlayers == 2) {
			greenCount = 4;
			whiteCount = 4;
			blueCount = 4;
			blackCount = 4;
			redCount = 4;
			goldCount = 2;
		} else if (numofPlayers == 3) {
			greenCount = 5;
			whiteCount = 5;
			blueCount = 5;
			blackCount = 5;
			redCount = 5;
			goldCount = 3;
		} else {
			greenCount = 7;
			whiteCount = 7;
			blueCount = 7;
			blackCount = 7;
			redCount = 7;
			goldCount = 5;
		}
	}

	public int getGreenCount() {
		return greenCount;
	}

	public int getWhiteCount() {
		return whiteCount;
	}

	public int getBlueCount() {
		return blueCount;
	}

	public int getBlackCount() {
		return blackCount;
	}

	public int getRedCount() {
		return redCount;
	}

	public int getGoldCount() {
		return goldCount;
	}
	public int gettotalGemAmount() {
		return totalGemAmount;
	}

	public void setNobleCount() {
		if (numofPlayers == 2) {
			noblesCount = 3;
		} else if (numofPlayers == 3) {
			noblesCount = 4;
		} else {
			noblesCount = 5;
		}
	}

	public int getNobleCount() {
		return noblesCount;
	}

	public void playerTurn() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Player One's Turn! Which action will you take?" + "\n");
		System.out.print(
				"[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
						+ "\n");
		String input = stdIn.next();
		while (!(input.equalsIgnoreCase("G") || input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P"))) {
			System.out.print("Invalid Command! Please Try again!\n"
					+ "[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
					+ "\n");
			input = stdIn.next();
		}
		if (input.equalsIgnoreCase("G")) {
			getGems();
		}
		else if (input.equalsIgnoreCase("R")) {
			getReserveCard();
		}
		else {
			purchaseCard();
		}

		if (numofPlayers == 2) {
			playerTwoTurn();
		}
		if (numofPlayers == 3) {
			playerTwoTurn();
			playerThreeTurn();
		}
		if (numofPlayers == 4) {
			playerTwoTurn();
			playerThreeTurn();
			playerFourTurn();
		}

	}
/**
 * helper method to call player 2's turn
 */
	public void playerTwoTurn() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Player Two's Turn! Which action will you take?" + "\n");
		System.out.print(
				"[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
						+ "\n");
		String input = stdIn.next();
		while (!(input.equalsIgnoreCase("G") || input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P"))) {
			System.out.print("Invalid Command! Please Try again!\n"
					+ "[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
					+ "\n");
			input = stdIn.next();
		}
	}
/**
 * helper method to call player 3's turn
 */
	public void playerThreeTurn() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Player Three's Turn! Which action will you take?" + "\n");
		System.out.print(
				"[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
						+ "\n");
		String input = stdIn.next();
		while (!(input.equalsIgnoreCase("G") || input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P"))) {
			System.out.print("Invalid Command! Please Try again!\n"
					+ "[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
					+ "\n");
			input = stdIn.next();
		}
	}
/**
 * helper method to call player 4's turn
 */
	public void playerFourTurn() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Player Four's Turn! Which action will you take?" + "\n");
		System.out.print(
				"[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
						+ "\n");
		String input = stdIn.next();
		while (!(input.equalsIgnoreCase("G") || input.equalsIgnoreCase("R") || input.equalsIgnoreCase("P"))) {
			System.out.print("Invalid Command! Please Try again!\n"
					+ "[G] - take Gems | [R] - reserve a card and take Gold coin (if available) | [P] - purchase a card"
					+ "\n");
			input = stdIn.next();
		}
	}
	/**
	 * helper method for getting tokens per player's turn
	 */
	public void getGems() {
		System.out.print("Pick 3 tokens of different colors or 2 tokens of the same color!");
	}
}
