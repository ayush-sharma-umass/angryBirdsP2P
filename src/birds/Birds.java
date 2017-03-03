package birds;

import java.util.ArrayList;
import java.util.List;

import constants.Constants;
import utils.Utils;

public class Birds {
	private int id;
	private int duration;
	private int destination;
	
	public Birds() {
		destination = Utils.getInRange(Constants.BirdConstants.MIN_DESTINATION, Constants.BirdConstants.MAX_DESTINATION);
		duration = Utils.getInRange(Constants.BirdConstants.MIN_DURATION, Constants.BirdConstants.MAX_DURATION);
		id = Constants.BirdConstants.DEFAULT_BIRD_ID;
	}
	
	public List<Integer> getFlightDetails() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(id); list.add(duration); list.add(destination);
		return list;
	}
}
