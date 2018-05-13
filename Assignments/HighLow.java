package Assignments;
import java.util.Scanner;
public class HighLow {

	public static void main(String[] args) {
		DeckOfCards deck1 = new DeckOfCards();
		Scanner user = new Scanner(System.in);
		int count = 0;
		Card currentCard = deck1.deal();
		Card nextCard;
		char guess;
		
		deck1.shuffle();
		
		System.out.println("Ok let's play High Low!");
		System.out.println("The first card is " + currentCard);
		
		while(true){
			System.out.println("Will the next card be higher (H) or lower (L)?");
			guess = user.next().charAt(0);
			if(guess != 'H' && guess!= 'L'){
				System.out.println("Respond with H or L");
			}
			
			nextCard = deck1.deal();
			System.out.println("The next card is " + nextCard);
			
			if(guess == 'H'){
				if(nextCard.isHigherThan(currentCard) == true){
					System.out.println("Congrats your guess was correct! Let's keep going!");
					count++;					
				}
				else{
					System.out.println("Sorry your guess was wrong...Game Over!");
					break;
				}
			}
			else if(guess == 'L'){
				if(nextCard.isHigherThan(currentCard) == false){
					System.out.println("Congrats your guess was correct! Let's keep going!");
					count++;			
				}
				else{
					System.out.println("Sorry your guess was wrong...Game Over!");
					break;
				}
			}
			
			currentCard = nextCard;
			System.out.println("The card is now " + currentCard);
		}
		
		System.out.println("\n" + "You made " + count + " right guesses!");
	}

}
