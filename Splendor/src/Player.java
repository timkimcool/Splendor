import java.util.ArrayList;

public class Player {
	ArrayList<Card> rCards;		// cards player has in hand (max 3)
	int emeraldToken;
	int diamondToken;
	int sapphireToken;
	int onyxToken;
	int rubyToken;
	int goldToken;
	int points;
	ArrayList<Noble> nobles;
	ArrayList<Card> tCards;		// cards player has on table
	
	public Player() {
		rCards = new ArrayList<Card>();
		points = 0;
		tCards = new ArrayList<Card>();
		emeraldToken = 0;
		diamondToken = 0;
		sapphireToken = 0;
		onyxToken = 0;
		rubyToken = 0;
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
	public void addEmerald() {
		emeraldToken++;
	}
	public void addDiamond() {
		diamondToken++;
	}
	public void addSapphire() {
		sapphireToken++;
	}
	public void addOnyx() {
		onyxToken++;
	}
	public void addRuby() {
		rubyToken++;
	}
	public void addGold() {
		goldToken++;
	}
	
	// remove tokens
	public void removeEmerald() {
		emeraldToken--;
	}
	public void removeDiamond() {
		diamondToken--;
	}
	public void removeSapphire() {
		sapphireToken--;
	}
	public void removeOnyx() {
		onyxToken--;
	}
	public void removeRuby() {
		rubyToken--;
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
		gemCost = card.getEmeraldCost();
		if (gemCost > emeraldToken) {
			diff = gemCost - emeraldToken;
			if (diff > 0) {
				emeraldToken = 0;
				goldToken -= diff;
			} else {
				emeraldToken -= gemCost;
			}
		}
		
		gemCost = card.getDiamondCost();
		if (gemCost > diamondToken) {
			diff = gemCost - diamondToken;
			if (diff > 0) {
				diamondToken = 0;
				goldToken -= diff;
			} else {
				diamondToken -= gemCost;
			}
		}
		
		gemCost = card.getSapphireCost();
		if (gemCost > sapphireToken) {
			diff = gemCost - sapphireToken;
			if (diff > 0) {
				sapphireToken = 0;
				goldToken -= diff;
			} else {
				sapphireToken -= gemCost;
			}
		}
		
		gemCost = card.getOnyxCost();
		if (gemCost > onyxToken) {
			diff = gemCost - onyxToken;
			if (diff > 0) {
				onyxToken = 0;
				goldToken -= diff;
			} else {
				onyxToken -= gemCost;
			}
		}
		
		gemCost = card.getRubyCost();
		if (gemCost > rubyToken) {
			diff = gemCost - rubyToken;
			if (diff > 0) {
				rubyToken = 0;
				goldToken -= diff;
			} else {
				rubyToken -= gemCost;
			}
		}
		
		tCards.add(card);
		points += card.getPoints();
	}
	
	// returns true or false depending on whether or not card can be purchased
	public boolean canPurchaseCard(Card card) {
		int diff = 0;
		if (card.getEmeraldCost() > emeraldToken) {
			diff += card.getEmeraldCost() - emeraldToken;
		}
		if (card.getDiamondCost() > diamondToken) {
			diff += card.getDiamondCost() - diamondToken;
		}
		if (card.getSapphireCost() > sapphireToken) {
			diff += card.getSapphireCost() - sapphireToken;
		}
		if (card.getOnyxCost() > onyxToken) {
			diff += card.getOnyxCost() - onyxToken;
		}
		if (card.getRubyCost() > rubyToken) {
			diff += card.getRubyCost() - rubyToken;
		}
		return (diff < goldToken);
	}
	
	public void addNoble(Noble noble) {
		nobles.add(noble);
		points += noble.getPoint();
	}
	
}
