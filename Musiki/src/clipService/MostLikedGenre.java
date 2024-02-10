package clipService;

import java.util.HashMap;
import java.util.Map;

import models.Dinleyici;

public class MostLikedGenre {
	
	public static String FinalGenre(Dinleyici dinleyici) {
		
		HashMap<String,Long> map = dinleyici.listenTimes;

		Long maks = 0L;
		
		String finalGenre = "";
		
		for (Map.Entry<String, Long> entry : map.entrySet()) {
            
			if(entry.getValue().longValue() > maks) {
				maks = entry.getValue().longValue();
				finalGenre = entry.getKey().toString();
			}		
		}	
		return finalGenre;
	}
}