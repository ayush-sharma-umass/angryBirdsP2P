package utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Utils {
	
	public static int getInRange(int a, int b) {
		// returns a random number in the range [a, b] which is the target
		Random rand = new Random();
		int ret = rand.nextInt(a) + (b - a + 1);
		return ret;
	}
	
	public static Map<Integer, List<Integer>> getNetwork() {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		return map;
	}
	
}
