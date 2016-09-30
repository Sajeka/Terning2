import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class DiceTest {


	/**
	 * Test if the d6 rolls 1-6.
	 *
	 * @throws Exception
	 */
	@Test
	public void testRoll1To6() throws Exception {
		for (int i = 0; i < 100000; i++) {
			Dice dice = new Dice();
			int val = dice.roll();
			assertTrue(val >= 1 && val <= 6);
		}
	}

	/**
	 * Test if the occurrences of 1-6 on the d6 is truly random
	 *
	 * @throws Exception
	 */
	@Test
	public void testRollOccurrences() throws Exception {
		int rolls = 60000;
		int[] num = {0,0,0,0,0,0};
		for (int i = 0; i < rolls; i++) {
			Dice dice = new Dice();
			num[dice.roll()-1]++;
		}
		for (int i = 0; i < num.length; i++) {
			assertTrue(i+" = " + num[i], (num[i] <= 10400 && num[i] >= 9600));
		}
	}


}