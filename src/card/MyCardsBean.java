package card;

import java.io.Serializable;

public class MyCardsBean implements Serializable {
	private String card1, card2, card3, card4, card5;
	private String yaku;
	
	public String getCard1() { return card1; }
	public String getCard2() { return card2; }
	public String getCard3() { return card3; }
	public String getCard4() { return card4; }
	public String getCard5() { return card5; }
	public String getYaku()  { return yaku;  }
	
	public void setCard1(String s) { card1 = s; }
	public void setCard2(String s) { card2 = s; }
	public void setCard3(String s) { card3 = s; }
	public void setCard4(String s) { card4 = s; }
	public void setCard5(String s) { card5 = s; }
	public void setYaku(String s)  { yaku  = s; }

}
