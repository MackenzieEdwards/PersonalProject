import java.util.Scanner;

public class Players 
{
	
	 public static String instructions()
	 {
		System.out.println("Welcome to the bowling game! In this game you (the user) will be input the number of people that will be playing.");
		System.out.println("The game has a max of four people.");
		System.out.println("Next the program will bowl each frame for each player. After each frame it will print out the scores.");
		System.out.println("After the end of the tenth frame it will ask if you would like to play again. Have fun!");
		return null; 
	 }
	 
	 public static int numberOfPlayers()
		{
			int numPlayers = 1;
		
			System.out.println("How many players would you like in this game?");
			Scanner userInput = new Scanner(System.in);
			numPlayers = userInput.nextInt();
			System.out.println("Ok there are " + numPlayers + " players in this game.");
		
			return numPlayers;
		}
	 
	 public static int[][] createScoreSheet(int players)
	 {
		 int[][] scoreArray = new int[players + 1][21];
		 return scoreArray;
	 }
	 
	 public static int playerBowl()
	 {
		int firstThrow;
		int secondThrow;
		int currentScore = 0;
		firstThrow = RandomScore.generateNumber(10);
			if(firstThrow == 10)
			{
					
			}
			else
			{
				secondThrow = RandomScore.generateNumber(10 - firstThrow);
			}
			return currentScore;
	 }
	 

}
