package Assignments;

public class DeckOfCards {
	private int numCards = 52;
	private Card[] deck;
	
	private int aCard;
	
	public DeckOfCards(){
		deck = new Card[numCards];
		int i = 0;
		
		for(int suit = 1; suit <= 4; suit++){
			for(int rank = 1; rank <= 13; rank++){
				deck[i++] = new Card(suit, rank);	
			}
		aCard = 0;
		}
	}
		
		public void shuffle(){
			int i, j, k;
			
			for(k = 0; k < 10; k++){
				 i = (int) ( numCards * Math.random() );  
		   	     j = (int) ( numCards * Math.random() );  
			
		   	     Card temp = deck[i];
		   	     deck[i] = deck[j];
		   	     deck[j] = temp;
			}
		} 
	
		public Card deal(){
			if(aCard<=numCards){
				return(deck[aCard++]);
			}
			else{
				System.out.println("No cards left");
				return null;
			}
		}
		public String toString(){
	   	 String s = "";
	   	 int k;
	    
	   	 k = 0;
	   	 for ( int i = 0; i < 4; i++ )
	   	 {
	   	    for ( int j = 1; j <= 13; j++ )
	   		s += (deck[k++] + " " + "\n");
	   	 }
	   	 return ( s );
	     }
}