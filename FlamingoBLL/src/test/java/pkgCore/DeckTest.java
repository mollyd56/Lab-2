package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		// Build a deck(1), make sure there are 52 cards in the deck
		Deck deck1 = new Deck(1);
		assertTrue(deck1.getSize() == 52);
		
		// Build a deck(6), make sure there are 312 cards in the deck 
		Deck deck6 = new Deck(6);
		assertTrue(deck6.getSize() == 312);
	}
}
