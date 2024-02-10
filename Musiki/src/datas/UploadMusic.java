package datas;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadMusic {
	
	
	public static void upload(String path1,String sanatci,String muzikAdi, String muzikTuru) {
		
		String wavName = sanatci + "-" + muzikAdi + "-" + muzikTuru + ".wav";
		
		Path file = Paths.get(path1);
		Path file2 = Paths.get("src\\Musikiler\\" + wavName);
		try {
			Files.copy(file,file2, REPLACE_EXISTING);
			
			System.out.println("Dosya tasindi.");
		}catch (IOException e) {
				e.printStackTrace();
		}
		
		
		
		
	}

}
