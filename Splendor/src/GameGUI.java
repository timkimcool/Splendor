import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI extends JFrame {
	private SelectButton deckOne, deckOne1, deckOne2, deckOne3, deckOne4;
	private SelectButton deckTwo, deckTwo1, deckTwo2, deckTwo3, deckTwo4;
	private SelectButton deckThree, deckThree1, deckThree2, deckThree3, deckThree4;
	private SelectButton noble1, noble2, noble3, noble4, noble5;
	private SelectButton greenT, whiteT, blueT, blackT, redT, goldT;
	
	final int POS_X = 100;
	final int POS_Y = 70;
	final int CARD_X = 125;
	final int CARD_Y = 150;
	final int GAP = 20;
	final int GAP_Y = CARD_Y + GAP;
	final int GAP_X = CARD_X + GAP;
	final int FRAME_WIDTH = 1200;
	final int FRAME_HEIGHT = FRAME_WIDTH * 3 / 4;
	final int TOKEN_X = 125;
	final int TOKEN_Y = 125;
	final int TOKEN_Y_POS = 190;
	final int GAP_T = 145;
	
	public Game game;
	JPanel panel;
	
	public GameGUI(Game game) {
		panel = new JPanel();
		panel.setLayout(null);
		this.game = game;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setupButtons();
		
		
		this.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
	
	
	private void setupButtons() {
		int x;
		x = POS_X;
		deckOne = new SelectButton(x, POS_Y + GAP_Y, CARD_X, CARD_Y, "Deck One", this);
		deckTwo = new SelectButton(x, POS_Y + GAP_Y * 2, CARD_X, CARD_Y, "Deck Two", this);
		deckThree = new SelectButton(x, POS_Y + GAP_Y * 3, CARD_X, CARD_Y, "Deck Three", this);
		panel.add(deckOne);
		panel.add(deckTwo);
		panel.add(deckThree);
		
		noble1 = new SelectButton(x, POS_Y, CARD_X, CARD_Y, game.getNoble1(), this);
		panel.add(noble1);
		
		x += GAP_X;
		deckOne1 = new SelectButton(x, POS_Y + GAP_Y, CARD_X, CARD_Y, game.getDeckOne1(), this);
		deckTwo1 = new SelectButton(x, POS_Y + GAP_Y * 2, CARD_X, CARD_Y, game.getDeckTwo1(), this);
		deckThree1 = new SelectButton(x, POS_Y + GAP_Y * 3, CARD_X, CARD_Y, game.getDeckThree1(), this);
		panel.add(deckOne1);
		panel.add(deckTwo1);
		panel.add(deckThree1);
		
		noble2 = new SelectButton(x, POS_Y, CARD_X, CARD_Y, game.getNoble2(), this);
		panel.add(noble2);
		
		x += GAP_X;
		deckOne2 = new SelectButton(x, POS_Y + GAP_Y, CARD_X, CARD_Y, game.getDeckOne2(), this);
		deckTwo2 = new SelectButton(x, POS_Y + GAP_Y * 2, CARD_X, CARD_Y, game.getDeckTwo2(), this);
		deckThree2 = new SelectButton(x, POS_Y + GAP_Y * 3, CARD_X, CARD_Y, game.getDeckThree2(), this);
		panel.add(deckOne2);
		panel.add(deckTwo2);
		panel.add(deckThree2);
		
		noble3 = new SelectButton(x, POS_Y, CARD_X, CARD_Y, game.getNoble3(), this);
		panel.add(noble3);
		
		x += GAP_X;
		deckOne3 = new SelectButton(x, POS_Y + GAP_Y, CARD_X, CARD_Y, game.getDeckOne3(), this);
		deckTwo3 = new SelectButton(x, POS_Y + GAP_Y * 2, CARD_X, CARD_Y, game.getDeckTwo3(), this);
		deckThree3 = new SelectButton(x, POS_Y + GAP_Y * 3, CARD_X, CARD_Y, game.getDeckThree3(), this);
		panel.add(deckOne3);
		panel.add(deckTwo3);
		panel.add(deckThree3);
		
		if (game.getNobleCount() > 3) {
			noble4 = new SelectButton(x, POS_Y, CARD_X, CARD_Y, game.getNoble4(), this);
			panel.add(noble4);
		}
		
		x += GAP_X;
		deckOne4 = new SelectButton(x, POS_Y + GAP_Y, CARD_X, CARD_Y, game.getDeckOne4(), this);
		deckTwo4 = new SelectButton(x, POS_Y + GAP_Y * 2, CARD_X, CARD_Y, game.getDeckTwo4(), this);
		deckThree4 = new SelectButton(x, POS_Y + GAP_Y * 3, CARD_X, CARD_Y, game.getDeckThree4(), this);
		panel.add(deckOne4);
		panel.add(deckTwo4);
		panel.add(deckThree4);
		
		if (game.getNobleCount() > 4) {
			noble5 = new SelectButton(x, POS_Y, CARD_X, CARD_Y, game.getNoble5(), this);
			panel.add(noble5);
		}
		
		x += GAP_X;
		greenT = new SelectButton(x, TOKEN_Y_POS, TOKEN_X, TOKEN_Y, "Green: " + game.getGreenCount(), this);
		whiteT = new SelectButton(x, TOKEN_Y_POS + GAP_T , TOKEN_X, TOKEN_Y, "White: " + game.getWhiteCount(), this);
		blueT = new SelectButton(x, TOKEN_Y_POS + GAP_T * 2, TOKEN_X, TOKEN_Y, "Blue: " + game.getBlueCount(), this);
		x += GAP_X;
		blackT = new SelectButton(x, TOKEN_Y_POS, TOKEN_X, TOKEN_Y, "Black: " + game.getGreenCount(), this);
		redT = new SelectButton(x, TOKEN_Y_POS + GAP_T , TOKEN_X, TOKEN_Y, "Red: " + game.getRedCount(), this);
		goldT = new SelectButton(x, TOKEN_Y_POS + GAP_T * 2, TOKEN_X, TOKEN_Y, "Gold: " + game.getGoldCount(), this);
		

	}
	
	public String returnName(SelectButton button) {
		return button.getName();
	}
}






//new ImageIcon(filePath)
/******************************************************/
// "MemoryButton"
class SelectButton extends JButton implements ActionListener {  
	Card card;
	Noble noble;
	GameGUI frame;

	/////////////////////////////////  
	SelectButton(int x,int y, int width, int height, Card card, GameGUI frame) {  // ImageIcon image
		super(card.GUI());  // super(image);
		setBounds(x, y, width, height);  // xy is location, width/height is size
		this.card = card;  
		this.frame = frame;
		this.frame.add(this);  
		addActionListener(this);  
	}  
	
	SelectButton(int x,int y, int width, int height, Noble noble, GameGUI frame) {  // ImageIcon image
		super(noble.GUI());  // super(image);
		setBounds(x, y, width, height);  // xy is location, width/height is size
		this.noble = noble;  
		this.frame = frame;
		this.frame.add(this);  
		addActionListener(this);  
	}  
	
	SelectButton(int x,int y, int width, int height, String label, GameGUI frame) {  
		super(label);  
		setBounds(x, y, width, height);  // xy is location, width/height is size
		this.card = card;  
		this.frame = frame;
		this.frame.add(this);  
		addActionListener(this);  
	} 
	////////////////////////////////////////////////  
	public void actionPerformed(ActionEvent ev)  
	{  
		frame.returnName(this);
	}
}