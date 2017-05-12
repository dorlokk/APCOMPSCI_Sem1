/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card uno = new Card("7", "Clubs", 5);
		Card dos = new Card("5", "Diamonds",3);
		Card tres = new Card("9", "Spades", 1);
		
		System.out.println("Is uno the same as tres: " + uno.matches(tres));
		System.out.println("values of dos: " + dos.toString());
		System.out.println("Rank of tres: " + tres.rank());
	}
}
