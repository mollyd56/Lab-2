package pkgCore;

import java.util.Collections;

import pkgEnum.*;

public class Deck {

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	private ArryList<Card> DeckCards = new ArrayList<Card>();
	
	
	//	TODO: Add a contructor that passes in the number of decks, and then populates ArrayList<Card> with cards (depending on number of decks).
	
	public Deck() {
		
	for (eSuit eSuit: eSuit.values()) {
		
		for (eRank eRank: eRank.values()) {
			DeckCards.add(new Card(eRank, eSuit))
		}
	}
	
	Collections.shuffle(DeckCards);
		
	
	for (Card c: DeckCards) {
		System.out.print(c.geteSuit););
		System.out.print(c);
		}
	}
	
	//	TODO: Add a draw() method that will take a card from the deck and return it to the caller
	
	public Card Draw() throws Exception {
	
		if (DeckCards.size()==0) {
			throw new Exception("Empty Deck");
		}
		
		Card c = DeckCards.get(0);
		DeckCards.remove(c);
		return c;
		
	}
	
}
