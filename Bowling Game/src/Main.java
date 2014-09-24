public class Main {

	public static void main(String[] args) {
		int numPlayers;
		int whichThrow = 0;
		int firstThrow = 0;
		int secondThrow = 0;

		Players.instructions();
		System.out.println();

		System.out.println();
		numPlayers = Players.numberOfPlayers();

		Players.newArrayList(numPlayers);
		System.out.println();

		Players.createScoreSheet(numPlayers);

		for (int frameCount = 1; frameCount < 11; frameCount++) // track frames bowled
		{
			System.out.println("Frame: " + frameCount);

			for (int bowler = 1; bowler <= numPlayers; bowler++) //tracks which bowler
			{
				System.out.println("Bowler" + bowler);
				
				Players.twoThrows(bowler, frameCount);
						 
				//System.out.println("Bowler" + bowler+ RandomScore.generateNumber(maxThrow));
			}
			// show bowl total(Everyone)
			// do next frame
		}
	}

}