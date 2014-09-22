import java.util.Random;
public class RandomScore 
{
	 public static int generateNumber(int maxThrow)
	 {
		 Random rand = new Random();
		 int num = rand.nextInt(maxThrow) + 0;
		 return num; 
		
	 }
	
	
	
	
	
}
