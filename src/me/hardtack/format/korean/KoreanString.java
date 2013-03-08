package me.hardtack.format.korean;


public class KoreanString {
	
	public static String format(String format, Object... args){
		KoreanFormatter formatter = new KoreanFormatter();
		formatter.format(format, args);
		return formatter.toString();
	}
}
