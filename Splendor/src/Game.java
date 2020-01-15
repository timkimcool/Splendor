import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	static int numofPlayers;
	static ArrayList<Player> playerList;
	static Player p1, p2, p3, p4;
	static int totalGemAmount;
	static int greenCount, whiteCount, blueCount, blackCount, redCount, goldCount;
	static int noblesCount;
	static ArrayList<Noble> nobles;
	static ArrayList<Card> deckOne, deckTwo, deckThree;
	static boolean finalRound = true;
	
	static boolean redAvailable = true;
	static boolean blueAvailable = true;
	static boolean greenAvailable = true;
	static boolean whiteAvailable = true;
	static boolean blackAvailable = true;
	static boolean goldAvailable = true;
	
	static Random rand;
	
	static Card deckOne1, deckOne2, deckOne3, deckOne4;
	static Card deckTwo1, deckTwo2, deckTwo3, deckTwo4;
	static Card deckThree1, deckThree2, deckThree3, deckThree4;
	static Noble noble1, noble2, noble3, noble4, noble5;
	
	static GameGUI UI;

	public Game() {
		numofPlayers = 1;
		totalGemAmount = 0;
		playerList = new ArrayList<Player>();
		noblesCount = 10;
		deckOne = new ArrayList<Card>();
		deckTwo = new ArrayList<Card>();
		deckThree = new ArrayList<Card>();
		nobles = new ArrayList<Noble>();
		rand = new Random();
		createDeckOne();
		createDeckTwo();
		createDeckThree();
		createNoble();
	}

	public static void main(String[] args) {
		// set up new game
		Game Splendor = new Game();
		noblesCount = 5;
		setupCardsNobles();
		UI = new GameGUI(Splendor);
		
		
		
		/*
		Splendor.setPlayerCount();
		Splendor.setGemAmount();
		Splendor.setNobleCount();
		Splendor.initialMessage();
		Splendor.playerTurn();

		// starts round and continues until someone obtains 15+ points
		while (!finalRound) {

		}
		*/
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
		p1 = new Player("Player 1");
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
			p2 = new Player("Player 2");
			playerList.add(p2);
			numofPlayers++;
		}
		if (numofPlayers < playerCount) {
			p3 = new Player("Player 3");
			playerList.add(p3);
			numofPlayers++;
		}
		if (numofPlayers < playerCount) {
			p4 = new Player("Player 4");
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
	
	public void createDeckOne() {
		Card c1 = new Card(0, 0, 1, 1, 1, 1, "Black");
		Card c2 = new Card(0, 0, 0, 1, 0, 2, "Black");
		Card c3 = new Card(0, 0, 2, 0, 0, 2, "Black");
		Card c4 = new Card(0, 1, 0, 3, 0, 1, "Black");
		Card c5 = new Card(0, 0, 0, 0, 0, 3, "Black");
		Card c6 = new Card(0, 0, 1, 1, 2, 1, "Black");
		Card c7 = new Card(0, 0, 2, 1, 2, 0, "Black");
		Card c8 = new Card(1, 0, 0, 0, 4, 0, "Black");
		Card c9 = new Card(0, 2, 1, 0, 0, 0, "Blue");
		Card c10 = new Card(0, 1, 1, 2, 0, 1, "Blue");
		Card c11 = new Card(0, 1, 1, 1, 0, 1, "Blue");
		Card c12 = new Card(0, 0, 0, 1, 1, 3, "Blue");
		Card c13 = new Card(0, 3, 0, 0, 0, 0, "Blue");
		Card c14 = new Card(0, 0, 1, 2, 0, 2, "Blue");
		Card c15 = new Card(0, 2, 0, 0, 0, 2, "Blue");
		Card c16 = new Card(1, 0, 0, 4, 0, 0, "Blue");
		Card c17 = new Card(0, 0, 2, 0, 1, 0, "Green");
		Card c18 = new Card(0, 0, 0, 2, 2, 0, "Green");
		Card c19 = new Card(0, 0, 1, 0, 3, 1, "Green");
		Card c20 = new Card(0, 1, 1, 1, 1, 0, "Green");
		Card c21 = new Card(0, 2, 1, 1, 1, 0, "Green");
		Card c22 = new Card(0, 2, 0, 2, 1, 0, "Green");
		Card c23 = new Card(0, 0, 0, 3, 0, 0, "Green");
		Card c24 = new Card(1, 4, 0, 0, 0, 0, "Green");
		Card c25 = new Card(0, 0, 3, 0, 0, 0, "Red");
		Card c26 = new Card(0, 3, 1, 1, 0, 0, "Red");
		Card c27 = new Card(0, 0, 0, 0, 2, 1, "Red");
		Card c28 = new Card(0, 2, 2, 0, 0, 1, "Red");
		Card c29 = new Card(0, 1, 2, 0, 1, 1, "Red");
		Card c30 = new Card(0, 1, 1, 0, 1, 1, "Red");
		Card c31 = new Card(0, 0, 2, 2, 0, 0, "Red");
		Card c32 = new Card(1, 0, 4, 0, 0, 0, "Red");
		Card c33 = new Card(0, 1, 0, 0, 2, 2, "White");
		Card c34 = new Card(0, 1, 0, 2, 0, 0, "White");
		Card c35 = new Card(0, 1, 0, 1, 1, 1, "White");
		Card c36 = new Card(0, 0, 0, 0, 3, 0, "White");
		Card c37 = new Card(0, 0, 0, 0, 2, 2, "White");
		Card c38 = new Card(0, 1, 0, 1, 1, 2, "White");
		Card c39 = new Card(0, 1, 3, 0, 1, 0, "White");
		Card c40 = new Card(1, 0, 0, 0, 0, 4, "White");
		deckOne.add(c1);
		deckOne.add(c2);
		deckOne.add(c3);
		deckOne.add(c4);
		deckOne.add(c5);
		deckOne.add(c6);
		deckOne.add(c7);
		deckOne.add(c8);
		deckOne.add(c9);
		deckOne.add(c10);
		deckOne.add(c11);
		deckOne.add(c12);
		deckOne.add(c13);
		deckOne.add(c14);
		deckOne.add(c15);
		deckOne.add(c16);
		deckOne.add(c17);
		deckOne.add(c18);
		deckOne.add(c19);
		deckOne.add(c20);
		deckOne.add(c21);
		deckOne.add(c22);
		deckOne.add(c23);
		deckOne.add(c24);
		deckOne.add(c25);
		deckOne.add(c26);
		deckOne.add(c27);
		deckOne.add(c28);
		deckOne.add(c29);
		deckOne.add(c30);
		deckOne.add(c31);
		deckOne.add(c32);
		deckOne.add(c33);
		deckOne.add(c34);
		deckOne.add(c35);
		deckOne.add(c36);
		deckOne.add(c37);
		deckOne.add(c38);
		deckOne.add(c39);
		deckOne.add(c40);
	}
	
	public void createDeckTwo() {
		Card c41 = new Card(1, 0, 3, 0, 2, 2, "Black");
		Card c42 = new Card(1, 2, 3, 0, 0, 3, "Black");
		Card c43 = new Card(2, 0, 0, 2, 1, 4, "Black");
		Card c44 = new Card(2, 0, 5, 0, 0, 0, "Black");
		Card c45 = new Card(2, 0, 0, 3, 0, 5, "Black");
		Card c46 = new Card(3, 6, 0, 0, 0, 0, "Black");
		Card c47 = new Card(1, 0, 0, 3, 2, 2, "Blue");
		Card c48 = new Card(1, 3, 0, 0, 2, 3, "Blue");
		Card c49 = new Card(2, 0, 5, 0, 3, 0, "Blue");
		Card c50 = new Card(2, 0, 0, 0, 5, 0, "Blue");
		Card c51 = new Card(2, 4, 2, 1, 0, 0, "Blue");
		Card c52 = new Card(3, 0, 0, 0, 6, 0, "Blue");
		Card c53 = new Card(1, 0, 3, 3, 0, 2, "Green");
		Card c54 = new Card(1, 2, 2, 0, 3, 0, "Green");
		Card c55 = new Card(2, 1, 4, 0, 2, 0, "Green");
		Card c56 = new Card(2, 0, 0, 0, 0, 5, "Green");
		Card c57 = new Card(2, 0, 0, 0, 5, 3, "Green");
		Card c58 = new Card(3, 0, 0, 0, 0, 6, "Green");
		Card c59 = new Card(1, 3, 0, 2, 3, 0, "Red");
		Card c60 = new Card(1, 3, 2, 2, 0, 0, "Red");
		Card c61 = new Card(2, 0, 1, 0, 4, 2, "Red");
		Card c62 = new Card(2, 5, 3, 0, 0, 0, "Red");
		Card c63 = new Card(2, 5, 0, 0, 0, 0, "Red");
		Card c64 = new Card(3, 0, 0, 6, 0, 0, "Red");
		Card c65 = new Card(1, 2, 0, 2, 0, 3, "White");
		Card c66 = new Card(1, 0, 2, 3, 3, 0, "White");
		Card c67 = new Card(2, 2, 0, 4, 0, 1, "White");
		Card c68 = new Card(2, 0, 0, 5, 0, 0, "White");
		Card c69 = new Card(2, 3, 0, 5, 0, 0, "White");
		Card c70 = new Card(3, 0, 6, 0, 0, 0, "White");
		deckTwo.add(c41);
		deckTwo.add(c42);
		deckTwo.add(c43);
		deckTwo.add(c44);
		deckTwo.add(c45);
		deckTwo.add(c46);
		deckTwo.add(c47);
		deckTwo.add(c48);
		deckTwo.add(c49);
		deckTwo.add(c50);
		deckTwo.add(c51);
		deckTwo.add(c52);
		deckTwo.add(c53);
		deckTwo.add(c54);
		deckTwo.add(c55);
		deckTwo.add(c56);
		deckTwo.add(c57);
		deckTwo.add(c58);
		deckTwo.add(c59);
		deckTwo.add(c60);
		deckTwo.add(c61);
		deckTwo.add(c62);
		deckTwo.add(c63);
		deckTwo.add(c64);
		deckTwo.add(c65);
		deckTwo.add(c66);
		deckTwo.add(c67);
		deckTwo.add(c68);
		deckTwo.add(c69);
		deckTwo.add(c70);
	}

	public void createDeckThree() {
		Card c71 = new Card(3, 0, 3, 3, 3, 5, "Black");
		Card c72 = new Card(4, 0, 0, 7, 0, 0, "Black");
		Card c73 = new Card(4, 3, 0, 6, 0, 3, "Black");
		Card c74 = new Card(5, 3, 0, 7, 0, 0, "Black");
		Card c75 = new Card(3, 5, 3, 3, 0, 3, "Blue");
		Card c76 = new Card(4, 0, 7, 0, 0, 0, "Blue");
		Card c77 = new Card(4, 3, 6, 0, 3, 0, "Blue");
		Card c78 = new Card(5, 0, 7, 0, 3, 0, "Blue");
		Card c79 = new Card(3, 3, 5, 3, 3, 0, "Green");
		Card c80 = new Card(4, 0, 3, 0, 6, 3, "Green");
		Card c81 = new Card(4, 0, 0, 0, 7, 0, "Green");
		Card c82 = new Card(5, 0, 0, 0, 7, 3, "Green");
		Card c83 = new Card(3, 3, 3, 0, 5, 3, "Red");
		Card c84 = new Card(4, 0, 0, 0, 0, 7, "Red");
		Card c85 = new Card(4, 0, 0, 3, 3, 6, "Red");
		Card c86 = new Card(5, 0, 0, 3, 0, 7, "Red");
		Card c87 = new Card(3, 3, 0, 5, 3, 3, "White");
		Card c88 = new Card(4, 7, 0, 0, 0, 0, "White");
		Card c89 = new Card(4, 6, 3, 3, 0, 0, "White");
		Card c90 = new Card(5, 7, 3, 0, 0, 0, "White");
		deckThree.add(c71);
		deckThree.add(c72);
		deckThree.add(c73);
		deckThree.add(c74);
		deckThree.add(c75);
		deckThree.add(c76);
		deckThree.add(c77);
		deckThree.add(c78);
		deckThree.add(c79);
		deckThree.add(c80);
		deckThree.add(c81);
		deckThree.add(c82);
		deckThree.add(c83);
		deckThree.add(c84);
		deckThree.add(c85);
		deckThree.add(c86);
		deckThree.add(c87);
		deckThree.add(c88);
		deckThree.add(c89);
		deckThree.add(c90);
	}
	public void createNoble() {
		Noble n1 = new Noble(3, 4, 0, 0, 4, 0);
		Noble n2 = new Noble(3, 3, 0, 3, 0, 3);
		Noble n3 = new Noble(3, 0, 4, 0, 0, 4);
		Noble n4 = new Noble(3, 0, 0, 4, 0, 4);
		Noble n5 = new Noble(3, 0, 4, 0, 4, 0);
		Noble n6 = new Noble(3, 3, 3, 0, 3, 0);
		Noble n7 = new Noble(3, 0, 3, 0, 3, 3);
		Noble n8 = new Noble(3, 4, 0, 4, 0, 0);
		Noble n9 = new Noble(3, 0, 3, 3, 0, 3);
		Noble n10 = new Noble(3, 3, 0, 3, 3, 0);
		nobles.add(n1);
		nobles.add(n2);
		nobles.add(n3);
		nobles.add(n4);
		nobles.add(n5);
		nobles.add(n6);
		nobles.add(n7);
		nobles.add(n8);
		nobles.add(n9);
		nobles.add(n10);
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
			// getReserveCard();
		}
		else {
			// purchaseCard();
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
	
	
	static void setupCardsNobles() {
		
		deckOne1 = deckOne.remove(rand.nextInt(deckOne.size()));
		deckOne2 = deckOne.remove(rand.nextInt(deckOne.size()));
		deckOne3 = deckOne.remove(rand.nextInt(deckOne.size()));
		deckOne4 = deckOne.remove(rand.nextInt(deckOne.size()));
		
		deckTwo1 = deckTwo.remove(rand.nextInt(deckTwo.size()));
		deckTwo2 = deckTwo.remove(rand.nextInt(deckTwo.size()));
		deckTwo3 = deckTwo.remove(rand.nextInt(deckTwo.size()));
		deckTwo4 = deckTwo.remove(rand.nextInt(deckTwo.size()));
		
		deckThree1 = deckThree.remove(rand.nextInt(deckThree.size()));
		deckThree2 = deckThree.remove(rand.nextInt(deckThree.size()));
		deckThree3 = deckThree.remove(rand.nextInt(deckThree.size()));
		deckThree4 = deckThree.remove(rand.nextInt(deckThree.size()));
		
		noble1 = nobles.remove(rand.nextInt(nobles.size()));
		noble2 = nobles.remove(rand.nextInt(nobles.size()));
		noble3 = nobles.remove(rand.nextInt(nobles.size()));
		if (noblesCount > 3) {
			noble4 = nobles.remove(rand.nextInt(nobles.size()));
		}
		if (noblesCount > 4) {
			noble5 = nobles.remove(rand.nextInt(nobles.size()));
		}
	}
	
	
	
	
	
	
	
	public Card getDeckOne1() {
		return deckOne1;
	}
	public Card getDeckOne2() {
		return deckOne2;
	}
	public Card getDeckOne3() {
		return deckOne3;
	}
	public Card getDeckOne4() {
		return deckOne4;
	}
	
	public Card getDeckTwo1() {
		return deckTwo1;
	}
	public Card getDeckTwo2() {
		return deckTwo2;
	}
	public Card getDeckTwo3() {
		return deckTwo3;
	}
	public Card getDeckTwo4() {
		return deckTwo4;
	}

	public Card getDeckThree1() {
		return deckThree1;
	}
	public Card getDeckThree2() {
		return deckThree2;
	}
	public Card getDeckThree3() {
		return deckThree3;
	}
	public Card getDeckThree4() {
		return deckThree4;
	}
	
	public Noble getNoble1() {
		return noble1;
	}
	public Noble getNoble2() {
		return noble2;
	}
	public Noble getNoble3() {
		return noble3;
	}
	public Noble getNoble4() {
		return noble4;
	}
	public Noble getNoble5() {
		return noble5;
	}
}
