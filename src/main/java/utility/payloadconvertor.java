package utility;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

public class payloadconvertor {
	
	public static String generatepayload(String filename) throws IOException
	{
		
		String filepath = "C:\\Users\\Qapitol\\Desktop\\RestAssuredFramework\\RCE_FrameWork_RA_D\\API-Framework-SystemTesting\\src\\main\\java\\resource\\"+filename;
		
		//This is the one which will convert the json format in to string format.
		return new String(Files.readAllBytes(Paths.get(filepath)));
		
	}

}
