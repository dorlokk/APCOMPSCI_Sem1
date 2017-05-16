/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] suits = {"clubs" , "diamonds", "hearts", "spades", "heart"};
		String[] ranks = {"ace", "7", "5", "king", "9"};
		int[] values = {5, 6, 7, 10, 3};
		Deck d = new Deck(suits, ranks, values);
		System.out.println("Dealing card " + d.deal());
		System.out.println("the size of the deck is " + d.size());
		System.out.println("is the deck empty? " +  d.isEmpty());
		String[] fsuit = {"clubs", "spades", "hearts", "diamonds"};
		String[] frank = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		int[] fvalue = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		Deck full = new Deck(frank, fsuit, fvalue);
		full.shuffle();
		System.out.println(full);
	}
}
