package utils;

import java.util.Random;

public class Utils {
	
	public static int getInRange(int a, int b) {
		// returns a random number in the range [a, b] which is the target
		Random rand = new Random();
		int ret = rand.nextInt(a) + (b - a + 1);
		return ret;
	}
	
}
