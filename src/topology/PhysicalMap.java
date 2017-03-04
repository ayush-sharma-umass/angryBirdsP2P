package topology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import constants.Constants;

public class PhysicalMap {
	private int nPigs;
	private Map<Integer, List<Integer>> map;
	
	public PhysicalMap() {
		// number of pigs
		nPigs = Constants.PigConstants.NUM_PIGS;
		map = new HashMap<Integer, List<Integer>>();
		
		// generate a random network map
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nPigs; i++) {
			list.add(i);
		}
		// generate a random permutation of a list
		Collections.shuffle(list);
				
		for (int i = 0; i < nPigs; i++) {
			int cur = list.get(i);
			int prev = list.get((nPigs + i-1)%nPigs);
			int next = list.get((nPigs + i+1)%nPigs);
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
