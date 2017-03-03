package constants;

public class Constants {
	
	public static class BirdConstants {
		// Number of birds in the game
		public static final int MAX_NUMBER_OF_BIRDS = 3;
		public static final int MAX_DESTINATION = 1000;
		public static final int MIN_DESTINATION = 0;
		public static final int MIN_DURATION = 1000;
		public static final int MAX_DURATION = 1000000;
		public static final int DEFAULT_BIRD_ID = 007;
	}
	
	public static class PigConstants {
		// Max number of pigs in the game
		public static final int NUM_PIGS = 6;
		// Max neighbours of pigs
		public static final int MAX_PIG_NEIGHBOURS = 2;
	}
	
	public static class MapConstants {
		// Size of maximum physical network
		public static final int MAP_SIZE = 1000;
	}
}
