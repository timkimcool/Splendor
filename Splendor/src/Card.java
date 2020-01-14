
public class Card {
	int greenCost;
	int whiteCost;
	int blueCost;
	int blackCost;
	int redCost;
	int points;
	String discount;

	public Card(int points, int blackCost, int whiteCost, int redCost, int blueCost, int greenCost, String discount) {
		this.greenCost = greenCost;
		this.whiteCost = whiteCost;
		this.blueCost = blueCost;
		this.blackCost = blackCost;
		this.redCost = redCost;
		this.points = points;
		this.discount = discount;
	}
	
	public int getGreenCost() {
		return greenCost;	
	}

	public int getWhiteCost() {
		return whiteCost;
	}

	public int getBlueCost() {
		return blueCost;
	}

	public int getBlackCost() {
		return blackCost;
	}

	public int getRedCost() {
		return redCost;
	}

	public int getPoints() {
		return points;
	}
	public String getDiscount() {
		return discount;
	}

}
