import java.util.*;

public class InsertSL{
	public int randomLevel(){
		
		Random rand = new Random();
		
		final double log2 = Math.log(2.0);
		
		Integer cap  = 3;
		
		int r = rand.nextInt(MAX_LEVEL);
		
		int k = (int) (Math.log(r+1)/ log2);
		
		if(k > MAX_LEVEL - 1) {
			k = MAX_LEVEL -1;
		}
		
		return MAX_LEVEL - k; 
	}
}