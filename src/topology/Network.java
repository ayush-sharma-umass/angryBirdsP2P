package topology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import constants.Constants;
import utils.Utils;

public class Network {
	private int nPigs;
	private Map<Integer, List<Integer>> map;
	
	static Network instance = null;
	public static Network getInstance() {
		if (instance == null) {
			instance = new Network();
		}
		return instance;
	}
	
	private Network() {
		// number of pigs
		nPigs = Constants.PigConstants.NUM_PIGS;
		map = new HashMap<Integer, List<Integer>>();
		
		// generate a network map
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nPigs; i++) {
			int cur = i;
			int prev = (nPigs + i -1)%nPigs;
			int next = (nPigs + i + 1)%nPigs;
			List<Integer> nbrList = new ArrayList<Integer>();
			list.add(prev); list.add(next);
			map.put(cur, nbrList);
		}
		
	}
	
	
	public List<Integer> getNeighbours(int id) {
		List<Integer> nbr = map.get(id);
		return nbr;
	}
}
