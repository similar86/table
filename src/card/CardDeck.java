package card;
import java.util.ArrayList;
import java.util.Collections;

public class CardDeck extends GameCard{
	private ArrayList<GameCard>deck;
	private static char[] Suit = {'s','h'};
	
	public CardDeck(){
		deck = new ArrayList<GameCard>();
		GameCard c;
		for(int h=0;h<4;h++){
			if(h==0){
				for(int i=1;i<14;i++){
					c = new GameCard(i,'s',true);
					deck.add(c);
				}
			}
			if(h==1){
				for(int i=1;i<14;i++){
					c = new GameCard(i,'h',true);
					deck.add(c);
				}
			}
			if(h==2){
				for(int i=1;i<14;i++){
					c = new GameCard(i,'d',true);
					deck.add(c);
				}
			}
			if(h==3){
				for(int i=1;i<14;i++){
					c = new GameCard(i,'c',true);
					deck.add(c);
				}
			}
		}
	}
	
	public GameCard nextCard(){
		return deck.remove(0);
	}
	 
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public CardDeck(char suit){
		deck = new ArrayList<GameCard>();
		GameCard g=new GameCard();
		for(int i=1;i<14;i++){
			g=new GameCard(i,suit,true);
			deck.add(g);
		}	
		System.out.println(deck);
	}
	
	public CardDeck(int limit){
		deck = new ArrayList<GameCard>();
		GameCard j = new GameCard();
		for(int i=1;i<5;i++){
			if(i==1){
				for(int h=1;h<=limit;h++){
					j=new GameCard(h,'s',true);
					deck.add(j);
				}
			}
			if(i==2){
				for(int h=1;h<=limit;h++){
					j=new GameCard(h,'h',true);
					deck.add(j);
				}
			}
			if(i==3){
				for(int h=1;h<=limit;h++){
					j=new GameCard(h,'d',true);
					deck.add(j);
				}
			}
			if(i==4){
				for(int h=1;h<=limit;h++){
					j=new GameCard(h,'c',true);
					deck.add(j);
				}
			}	
		}	
		System.out.println(deck);
	}
	public CardDeck(char suit[],int limit){
		deck = new ArrayList<GameCard>();
		GameCard dk = new GameCard();
		for(int l=0;l<suit.length;l++){
			for(int y=1; y<=limit; y++){
				dk = new GameCard(y ,suit[l] ,true);
				deck.add(dk);
			}
		}
		System.out.println(deck);
	}
	public static void main(String args[]){
		CardDeck gc=new CardDeck(Suit,6);
		//gc.shuffle();
		//for(int i=0; i<52; i++){
			//GameCard c = gc.nextCard();
			//System.out.println(gc);
		//}	
		
	}
}