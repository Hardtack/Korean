package kr.viewide.synchrok;

public class Eulrlega {	
	public static boolean eulrlega(String word) {
		char last = word.charAt(word.length()-1);
		
		if(last < 0xAC00)
			return true;
		
		last -= 0xAC00;
		
		char jong = (char) ((last % 28) + 0x11a7);		
		
		if(jong != 4519)
			return true;
		else
			return false;
	}
	
	public static String getEulrl(String word) {
		return eulrlega(word)? "을" : "를";
	}
	
	public static String getEga(String word) {
		return eulrlega(word)? "이" : "가";
	}
}