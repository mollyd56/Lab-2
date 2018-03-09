package pkgCore;

import java.util.Collections;

import pkgEnum.*;

public class Deck {

	private ArryList<Card> DeckCards = new ArrayList<Card>();
	
	public Deck(int numOfDecks) throws Exception {
		
		if (numOfDecks < 1) {
			
			throw new Exception("Number of Decks < 1");
			
			for (int a = 0; a < numOfDecks; a++) {
				
				for (eSuit eSuit: eSuit.values()) {
					
					for (eRank eRank: eRank.values()) {
					
						DeckCards.add(new Card(eRank, eSuit))
					}
				}
			}
			
			Collections.shuffle(DeckCards);
	
	for (Card c: DeckCards) {
		System.out.print(c.geteSuit););
		System.out.print(c);
		}
	}
	
	
	public Card Draw() throws Exception {
	
		if (DeckCards.size()==0) {
			throw new Exception("Empty Deck");
		}
		
		Card c = DeckCards.get(0);
		DeckCards.remove(c);
		return c;	
	}
}
