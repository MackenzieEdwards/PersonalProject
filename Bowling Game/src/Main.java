
public class Main {

	public static void main(String[] args) {
		int numPlayers;
		int firstThrow = 0;
		int secondThrow = 0;
		
		Players.instructions();
		System.out.println("");
		numPlayers = Players.numberOfPlayers();
		
		
		for (int frameCount=0; frameCount<10; frameCount++)
		{
			for(int bowler = 1; bowler <= numPlayers; bowler++)
			{
				// is this 10th frame?
				if (frameCount == 10)
				{
					
				}
				//firstThrow 
				if (firstThrow == 10)
				{
					System.out.println("You got a strike!");
				}
				//second throw if not strike
				else if (firstThrow < 10)
				{
					//do second throw
				}
				//determine if spare
				if (firstThrow + secondThrow == 10)
				{
					
				}
				//add scores(call scoring class) 
				//next player throw
			}
			//show bowl total(Everyone)
			//do next frame
			 
		}
	}
	 

}
