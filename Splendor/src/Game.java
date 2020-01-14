import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	static int numofPlayers;
	static ArrayList<Player> playerList;
	static Player p1, p2, p3, p4;
	static int greenCount, whiteCount, blueCount, blackCount, redCount, goldCount;
	static int noblesCount;

	public Game() {
		numofPlayers = 1;
		playerList = new ArrayList<Player>();
		noblesCount = 10;
	}

	public static void main(String[] args) {
		Game Splendor = new Game();
		Splendor.setPlayerCount();
		Splendor.setGemAmount();
		Splendor.setNobleCount();

	}

	/**
	 * Asks user for PlayerCount
	 */
	public static void setPlayerCount() {
		Scanner stdIn = new Scanner(System.in);
		p1 = new Player();
		playerList.add(p1);

		System.out.print("How many players will be playing? (2-4 players recommended) ");
		int playerCount = stdIn.nextInt();
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
	public int getPlayerCount () {
		return numofPlayers;
	}

	/**
	 * Sets up initial gems/token amount based on number of players
	 */
	public static void setGemAmount() {
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

	public static void setNobleCount() {
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
}
