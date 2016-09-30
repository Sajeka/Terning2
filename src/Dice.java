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
		float d1=(float)Math.random();     // 0-1
		float d2=d1*5;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		return d3 + 1;                     // 1-6		
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
