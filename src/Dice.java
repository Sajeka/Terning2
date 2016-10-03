import java.util.Random;

/**
 * Dice class
 *
 * This class can be used to roll a dice.
 */
public class Dice {
	/**
	 * Rolls a 6 sided dice.
	 *
	 * @return int
	 */
	public int roll() {
		Random random = new Random();
		return (random.nextInt(6)+1);
	}

	/**
	 * Roll a dice n times and print out the result in terminal.
	 *
	 * @param n amount of times to re-roll
	 */
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
