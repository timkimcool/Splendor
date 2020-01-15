
public class Noble {

	int point;
	int redCost;
	int blueCost;
	int blackCost;
	int greenCost;
	int whiteCost;
	
	public Noble(int point, int redCost, int blueCost, int blackCost, int greenCost, int whiteCost) {
		this.point = point;
		this.redCost = redCost;
		this.blueCost = blueCost;
		this.blackCost = blackCost;
		this.greenCost = greenCost;
		this.whiteCost = whiteCost;
	}
	
	public int getPoint() {
		return point;
	}
	
	public int getRedCost() {
		return redCost;
	}
	
	public int getblueCost() {
		return blueCost;
	}
	
	public int getBlackCost() {
		return blackCost;
	}
	
	public int getGreenCost() {
		return greenCost;
	}
	
	public int getWhiteCost() {
		return whiteCost;
	}
	
	public String GUI() {
		return "<html>" + "Noble" + "<br>" + "Points: " + point + "<br>" + "Green Cost: " + greenCost + "<br>" + 
				"White Cost: " + whiteCost + "<br>" + "Blue Cost: " + blueCost + "<br>" + 
				"Black Cost: " + blackCost + "<br>" +	"Red Cost: " + redCost + "</html>";
	}

}
