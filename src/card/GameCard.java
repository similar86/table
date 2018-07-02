package card;
import java.lang.Math;
import card.Card;
//public// 
class Card{
	private int number;
	private char suit;
	private static char[] Suit = {'s','h','d','c'};
	
	
	public int getNumber(){
		return number;
	}
	
	
	public int getNextNumber(){
		if(number==13) 
			return 1;
		else 
			return number+1;
	}
	
	public void plus1(){
		if(number==13)	
			number=1;
		else	
			number +=1;	
	}
	
	
	
	public String toString(){
		if(number==1){
			return suit+"A";
		}else if(number==11){
			return suit+"J";
		}else if(number==12){
			return suit+"Q";
		}else if(number==13){
			return suit+"K";
		}else{
			return String.format("%c%d", suit, number);
		}
		
	}
	
	public Card(){
		number=(int)(Math.random()*13)+1;
		int x =(int)(Math.random()*4);
		suit = Suit[x];
	}
	

	
	public Card(int number, char suit){
		this.number=number;
		this.suit=suit;	
	}
	
	
	
	//public static void main(String args[]){
		//Card c = new Card();
		//System.out.println(c.number);
		//System.out.println(c.suit);
		//System.out.println(c);
		//c.plus1();
		//System.out.println(c);
		//System.out.println(c.getNumber());
		//System.out.println(c.getNextNumber());
		
		//Card c = new Card(13,'s');
		//Card d = new Card();
		//System.out.println(c);
		//System.out.println(d);
	//}
}
public class GameCard extends Card{
	private boolean faceup;
	
	public String toString(){
		if(faceup==true){
			return super.toString();
		}else
			return "??";
	}
	
	
	boolean turn(){
		if(faceup)	return faceup=false;
		else	return faceup=true;
	}
	
	public GameCard(){
		super();
		faceup = Math.random() < 0.3;
	}
	
	public GameCard(int number,char suit,boolean faceup){
		super(number,suit);
		this.faceup = faceup;
	}
	
	boolean isFaceup(){
		return faceup;
	}
	
	public static void main(String args[]){
		for(int number2=1;number2<14;number2++){
			GameCard narabi=new GameCard(number2,'d',true);
			System.out.print(narabi+" ");
		}
		System.out.println();
		GameCard c =new GameCard();
		//GameCard d =new GameCard(4,'d',true);
		System.out.println(c);
		c.turn();
		System.out.println(c);
		//System.out.println(d);
	}
}
