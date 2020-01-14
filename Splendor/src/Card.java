
public class Card {
	int greenCost;
	int whiteCost;
	int blueCost;
	int blackCost;
	int redCost;
	int points;
	int greenDiscount;
	int whiteDiscount;
	int blueDiscount;
	int blackDiscount;
	int redDiscount;

	public Card(int greenCost, int whiteCost, int blueCost, int blackCost, int redCost, int points, int greenDiscount, int whiteDiscount, int blueDiscount, int blackDiscount, int redDiscount) {
		this.greenCost = greenCost;
		this.whiteCost = whiteCost;
		this.blueCost = blueCost;
		this.blackCost = blackCost;
		this.redCost = redCost;
		this.points = points;
		this.greenDiscount = greenDiscount;
		this.whiteDiscount = whiteDiscount;
		this.blueDiscount = blueDiscount;
		this.blackDiscount = blackDiscount;
		this.redDiscount = redDiscount;
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

}
