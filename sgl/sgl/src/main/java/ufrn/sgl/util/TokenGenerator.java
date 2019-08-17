package ufrn.sgl.util;

import java.nio.charset.Charset;
import java.util.Random;

public class TokenGenerator {

	public static String getToken () {
	    int leftLimit = 48; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 47;
	  
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    
	    String generatedString = buffer.toString();
	    System.out.println(generatedString);
	    return generatedString;
	}
	
}