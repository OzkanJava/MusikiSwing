package clipService;

import javax.sound.sampled.Clip;

import models.Dinleyici;

public class LogMusics {
	public static void kaydet(Dinleyici user,Clip clip,String genre) {
		long milisec;
		milisec = clip.getMicrosecondPosition();
		if(user.listenTimes.get(genre) == null) {
			user.listenTimes.put(genre, 0L);
		}
		long oldValue = user.listenTimes.get(genre);
		
		long newValue = oldValue + milisec; 
		user.listenTimes.replace(genre, newValue);
		System.out.println(user.listenTimes);
		
			
	}

}
