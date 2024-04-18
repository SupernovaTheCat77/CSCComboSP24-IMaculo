import java.util.ArrayList;
import java.util.List;

public class Pile {
	List<Card> pile;
	
	public Pile() {
		pile = new ArrayList<>();
	}
	
	public void addDeck(Deck deck) {
		for(Card card : deck.getCards()) {
			this.addCard(card);
		}
	}
	
	public void addPile(Pile pile) {
		while(!pile.isEmpty()) {
			this.pile.add(pile.popCard());
		}
	}
	
	public void addCard(Card card) {
		pile.add(card);
	}
	
	public int size() {
		return pile.size();
	}
	
	public Card popCard() {
		return pile.remove(0);
	}
	
	public boolean isEmpty() {
		return pile.isEmpty();
	}

	@Override
	public String toString() {
		return pile.toString();
	}
	
	
}