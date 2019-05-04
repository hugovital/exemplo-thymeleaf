package pagininha;

import java.util.Random;

public class PosterCommand {
	
	public boolean postar(String id, String token, String url) {
		
		Random r = new Random();
		int n = r.nextInt(2);
		return n >= 1;

	}

}
