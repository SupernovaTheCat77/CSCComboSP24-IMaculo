import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {	
		
		int runCount = 100000;
		int[] tieData = new int[runCount];
		int tieCountBig = 0;
		int p1count = 0;
		int p2count = 0;
	
	for (int z = 0; z < runCount; z++) {
		
		//System.out.println("***************ROUND " + z + "***************");
		///// Setup
		Deck deck = new Deck();
		deck.shuffle();
		
		Pile p1 = new Pile();
		Deck subDeck = deck.subDeck(0, 25);
		p1.addDeck(subDeck);
		
		Pile p2 = new Pile();
		subDeck = deck.subDeck(26, 51);
		p2.addDeck(subDeck);
		
		Pile midPile = new Pile();
		Pile p1Win = new Pile();
		Pile p2Win = new Pile();
		
		boolean tie = false;
		int extra = 0;
		int tieCount = 0;
		
		
	///// Logic
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			midPile.addCard(c1);
			midPile.addCard(c2);
			
			//if (tie == true) System.out.println("This round is worth " + extra + " extra point(s) due to previous tie(s).");
			
			//System.out.println(c1 + " vs. " + c2);
			int cmpResult = c1.compareTo(c2);
			
			if (cmpResult > 0) {
				p1Win.addPile(midPile);
				//System.out.println("Player 1 wins.\nCurrent score: " + p1Win.size()/2 + " | " + p2Win.size()/2 + "\n");
				tie = false;
				extra = 0;
				p1count++;
			}
			else if (cmpResult < 0) {
				p2Win.addPile(midPile);
				//System.out.println("Player 2 wins.\nCurrent score: " + p1Win.size()/2 + " | " + p2Win.size()/2 + "\n");
				tie = false;
				extra = 0;
				p2count++;
			}
			else {
				//System.out.println("Tie!\n");
				tie = true;
				extra++;
				tieCount++;
				tieCountBig++;
			}
		}
		
		
	///// Cards spent
		//if (p1Win.size() > p2Win.size()) System.out.print("\nPlayer 1 wins!");
		//else if (p1Win.size() < p2Win.size()) System.out.print("\nPlayer 2 wins!");
		//else System.out.print("\nPlayer 1 and Player 2 have tied!");
		
		//System.out.print(" Tie count: " + tieCount);
		
		tieData[z] = tieCount;
	}
		//System.out.println("\n");
		
		int smallest = tieData[0];
		int biggest = tieData[0];
		int iSmall = 0;
		int iBig = 0;
		
		for (int i = 0; i < tieData.length; i++) {
			//System.out.print(i + ": " + tieData[i] + "| ");
			//if ((i+1)%10 == 0) System.out.println();
			if (tieData[i] < smallest) {
				smallest = tieData[i];
				iSmall = i;
			}
			if (tieData[i] > biggest) {
				biggest = tieData[i];
				iBig = i;
			}
		}
		System.out.println("P1: " + p1count + ". P2: " + p2count + ". Tie: " + tieCountBig);
		System.out.println("Smallest: " + smallest + ", index " + iSmall + ". Biggest: " + biggest + ", index " + iBig + ".");
	}
}