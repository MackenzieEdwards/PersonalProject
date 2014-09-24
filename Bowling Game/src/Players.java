import java.util.Scanner;
import java.util.ArrayList;

public class Players
	{
	private String name;
	private String gender;
	private int age;

	public Players(String n, String g, int a)
		{
		name = n;
		gender = g;
		age = a;
		}

	public String getName()
		{
		return name;
		}

	public String getGender()
		{
		return gender;
		}

	public int getAge()
		{
		return age;
		}

	public static String instructions()
		{
		System.out
				.println("Welcome to the bowling game! In this game you (the user) will be input the number of people that will be playing.");
		System.out.println("The game has a max of four people.");
		System.out
				.println("Next the program will bowl each frame for each player. After each frame it will print out the scores.");
		System.out
				.println("After the end of the tenth frame it will ask if you would like to play again. Have fun!");
		return null;
		}

	public static int numberOfPlayers()
		{
		int numPlayers = 0;

		while (numPlayers <= 0 || numPlayers > 4)
		{
			System.out.println("How many players would you like in this game? (Four is the max number of people who can play.)");
			Scanner userInput = new Scanner(System.in);
			numPlayers = userInput.nextInt();
		
			if (numPlayers <= 0 || numPlayers > 4)
			{
				System.out.println("Incorrect number of players entered: " + numPlayers + " Try again.");
				System.out.println();
			}
		}	
			System.out.println("There are " + numPlayers + " players in this game.");
		
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
		if (firstThrow == 10)
			{

			} else
			{
			secondThrow = RandomScore.generateNumber(10 - firstThrow);
			}
		return currentScore;
		}

	public static void newArrayList(int numPlayers)
		{
		ArrayList<Players> information = new ArrayList<Players>();

		information.add(new Players("Susan", "female", 29));
		information.add(new Players("Jacob", "male", 12));
		information.add(new Players("Herman", "male", 95));
		information.add(new Players("Maria", "female", 23));

		if (numPlayers >= 1)
		{
		System.out.println("Player one is " + information.get(0).getName()
				+ " player one's gender is " + information.get(0).getGender()
				+ " and player one's age is " + information.get(0).getAge()
				+ ".");
		}
		
		if (numPlayers >= 2)
		{
		System.out.println("Player two is " + information.get(1).getName()
				+ " player two's gender is " + information.get(1).getGender()
				+ " and player two's age is " + information.get(1).getAge()
				+ ".");
		}
		
		if (numPlayers >= 3)
		{
		System.out.println("Player three is " + information.get(2).getName()
				+ " player three's gender is " + information.get(2).getGender()
				+ " and player three's age is " + information.get(2).getAge()
				+ ".");
		}
		if (numPlayers == 4)
		{
		System.out.println("Player four is " + information.get(3).getName()
				+ " player four's gender is " + information.get(3).getGender()
				+ " and player four's age is " + information.get(3).getAge()
				+ ".");
		}
	}

	public static void twoThrows(int bowler, int frameCount)
	{
		int firstThrow = 0;
		int secondThrow = 0;
		int whichThrow = 0;
		
		do
		{
		whichThrow++;
		
		switch (whichThrow) 
		{
		case 1:
			firstThrow = RandomScore.generateNumber(10);
			// is this 10th frame?
			
				// firstThrow
				if (firstThrow == 10) {
					System.out.println("You got a strike!");
				}
				// if not a strike
				else if (firstThrow > 1 && firstThrow < 10) 
				{
					// do second throw
					System.out.println("You bowled " + firstThrow);
				}
				else
				{
					System.out.println("You bowled a Gutter Ball");
				}

				// store firstThrow in array
			break;
		case 2:
			if (firstThrow == 10) //firstThrow is strike
			{
				secondThrow = 0;
			}else 
				{
				if (firstThrow == 0)	
				{
					secondThrow = RandomScore.generateNumber(10);
				} else if (firstThrow == 10)
					{
					secondThrow = 0;
					}
				else
				{
					secondThrow = RandomScore.generateNumber(10-firstThrow);
				}
					
					//determine if spare
					if (firstThrow + secondThrow == 10)
					{
						System.out.println("You got a spare!");
					}
					else if(secondThrow > 0 && secondThrow < 10)
					{
						System.out.println("you bowled: "+ secondThrow);
					} else
					{
						System.out.println("You bowled a Gutter Ball.");
					}
				}
				//store secondThrow in array
				break;
			}// end of switch
									
		}while(whichThrow != 2);
		
	}
}