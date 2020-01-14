import java.util.ArrayList;

public class Player {
	ArrayList<Card> rCards;		// cards player has in hand (max 3)
	int greenToken;
	int whiteToken;
	int blueToken;
	int blackToken;
	int redToken;
	int goldToken;
	int points;
	ArrayList<Noble> nobles;
	ArrayList<Card> tCards;		// cards player has on table
	String name;
	
	public Player(String name) {
		rCards = new ArrayList<Card>();
		points = 0;
		tCards = new ArrayList<Card>();
		greenToken = 0;
		whiteToken = 0;
		blueToken = 0;
		blackToken = 0;
		redToken = 0;
		goldToken = 0;
		
	}
	
	
	// return cards player has on reserve
	public ArrayList<Card> getRCards() {
		return rCards;
	}
	
	// return number of cards in reserve
	
	
	// return cards player has on table
	public ArrayList<Card> getTCards() {
		return tCards;
	}
	
	// return points
	public int getPoints() {
		return points;
	}
	
	// return nobles owned by player
	public ArrayList<Noble> getNobles() {
		return nobles;
	}
	
	// add tokens
	public void addGreen() {
		greenToken++;
	}
	public void addWhite() {
		whiteToken++;
	}
	public void addBlue() {
		blueToken++;
	}
	public void addBlack() {
		blackToken++;
	}
	public void addRed() {
		redToken++;
	}
	public void addGold() {
		goldToken++;
	}
	
	// remove tokens
	public void removeGreen() {
		greenToken--;
	}
	public void removeWhite() {
		whiteToken--;
	}
	public void removeBlue() {
		blueToken--;
	}
	public void removeBlack() {
		blackToken--;
	}
	public void removeRed() {
		redToken--;
	}
	public void removeGold() {
		goldToken--;
	}
	
	// reserve card and get gold coin if gold coin is available
	public void reserveCard(Card card, boolean goldAvailable) {
		if (goldAvailable) {
			addGold();
		}
		rCards.add(card);
	}
	
	// purchase a card by subtracting gem costs and adding card to table
	public void purchaseCard(Card card) {
		int diff = 0;;
		int gemCost;
		gemCost = card.getGreenCost();
		if (gemCost > greenToken) {
			diff = gemCost - greenToken;
			if (diff > 0) {
				greenToken = 0;
				goldToken -= diff;
			} else {
				greenToken -= gemCost;
			}
		}
		
		gemCost = card.getWhiteCost();
		if (gemCost > whiteToken) {
			diff = gemCost - whiteToken;
			if (diff > 0) {
				whiteToken = 0;
				goldToken -= diff;
			} else {
				whiteToken -= gemCost;
			}
		}
		
		gemCost = card.getBlueCost();
		if (gemCost > blueToken) {
			diff = gemCost - blueToken;
			if (diff > 0) {
				blueToken = 0;
				goldToken -= diff;
			} else {
				blueToken -= gemCost;
			}
		}
		
		gemCost = card.getBlackCost();
		if (gemCost > blackToken) {
			diff = gemCost - blackToken;
			if (diff > 0) {
				blackToken = 0;
				goldToken -= diff;
			} else {
				blackToken -= gemCost;
			}
		}
		
		gemCost = card.getRedCost();
		if (gemCost > redToken) {
			diff = gemCost - redToken;
			if (diff > 0) {
				redToken = 0;
				goldToken -= diff;
			} else {
				redToken -= gemCost;
			}
		}
		
		tCards.add(card);
		points += card.getPoints();
	}
	
	// returns true or false depending on whether or not card can be purchased
	public boolean canPurchaseCard(Card card) {
		int diff = 0;
		if (card.getGreenCost() > greenToken) {
			diff += card.getGreenCost() - greenToken;
		}
		if (card.getWhiteCost() > whiteToken) {
			diff += card.getWhiteCost() - whiteToken;
		}
		if (card.getBlueCost() > blueToken) {
			diff += card.getBlueCost() - blueToken;
		}
		if (card.getBlackCost() > blackToken) {
			diff += card.getBlackCost() - blackToken;
		}
		if (card.getRedCost() > redToken) {
			diff += card.getRedCost() - redToken;
		}
		return (diff < goldToken);
	}
	
	public void addNoble(Noble noble) {
		nobles.add(noble);
		points += noble.getPoint();
	}
	
}
