public class Scoring {

	static int[][] scoreSheet = new int[5][11];
	static int turn = 1;

	public static void calcScore(int playerNum, int[][]rolls) 
	{
		int frame = 1;
		int totalScore = 0;
		
		System.out.println();
		System.out.println("Calculating Scores for Bowler: "+ playerNum);
		
		for(int i = 1; i < 21; i++)
		{
			if((rolls[playerNum][i] == 10) && (i%2 != 0))
			{
				// calculate score for 2 or 3 Strikes
				if (rolls[playerNum][i+2] == 10)
				{
					scoreSheet[playerNum][frame] = rolls[playerNum][i] + rolls[playerNum][i+2] + rolls[playerNum][i+4];
					i++;
				} else if (i == 19)  // in tenth frame
				{
					scoreSheet[playerNum][frame] = rolls[playerNum][i] + rolls[playerNum][i+1] + rolls[playerNum][i+2];
				    i=i+2;
				} else
				{
				  scoreSheet[playerNum][frame] = rolls[playerNum][i] + rolls[playerNum][i+2] + rolls[playerNum][i+3];
				  i++;
				}
			} else if((rolls[playerNum][i] + rolls[playerNum][i+1]) == 10)
			{
				// calculate score for spare
				scoreSheet[playerNum][frame] = rolls[playerNum][i] + rolls[playerNum][i+1] + rolls[playerNum][i+2];
				i++;
			} else
			{
				// calculate score all other throws
				scoreSheet[playerNum][frame] = rolls[playerNum][i] + rolls[playerNum][i+1];
				i++;
			}
		
			totalScore = totalScore + scoreSheet[playerNum][frame];
			
			System.out.print("Score in Frame ");
			System.out.printf("%2d", frame);
			System.out.print(": ");
			System.out.printf("%3d", totalScore);
			System.out.println();
			
		    frame++;
		}
		System.out.println();
		System.out.println("The total score for player " +playerNum +" is " + totalScore + ".");
		System.out.println();
	}

}