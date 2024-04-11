import java.util.Random;

public class Deck {
	
	private Card[] cards;
	private static Random rand = new Random();
	public Deck(Card[] cards) {
		this.cards = cards;
	}
	
	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	
	public Card[] getCards() {
		return cards;
	}
	
	public void shuffle()
	{
		for (int i = 0; i < cards.length - 1; i ++) {
			//choose a random number between i and length - 1
			int num = randomInt(i, cards.length-1);
			//swap the ith card and the randomly chosen card
			swapCards(i, num);
			
		}
	}
	
	public void selectionSort() {
		for (int i = 0; i < cards.length-1; i++) {
			//find the lowest card at or to the right of i
			int lowest = indexLowest(i, cards.length-1);
			//swap the i card and the lowest card.
			swapCards(i, lowest);
		}
	}
	
	private int indexLowest(int low, int high) {
		int lowest = 0;
		for(int i = low; i < high; i++) {
			if(cards[i].compareTo(cards[lowest])<0) {
				lowest = i;
			}
		}
		return lowest;
	}
	
	private static int randomInt(int low, int high) {
		//return a random number between low and high
		//including both		
		int num = rand.nextInt(high - low) + low;
		return num;
	}
	
	private void swapCards(int i, int j) {
		//swap the i card with the j card in the array
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;		
	}
	
	
	public void print() {
		for(Card card : this.cards) {
			System.out.println(card);
		}
	}

}
