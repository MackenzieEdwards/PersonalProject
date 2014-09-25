//Main Class Mackenzie Edwards
public class Main {

	public static void main(String[] args) {
		int numPlayers; // number of bowlers playing game
		int turn = 1; // number of turns each bowler completes

		Players.instructions();
		numPlayers = Players.numberOfPlayers();
		Players.newArrayList(numPlayers);

		int[][] rolls = new int[numPlayers + 1][22];
		for (int bowler = 1; bowler <= numPlayers; bowler++) // tracks each	
		{
			System.out.println("****** Bowler " + bowler + " *******");

			for (int frame = 1; frame <= 10; frame++) {
				System.out.println("Frame: " + frame);
				turn = Players.twoThrows(bowler, rolls, turn);
			}
			Scoring.calcScore(bowler, rolls);
			turn = 1;
		}
	}
}