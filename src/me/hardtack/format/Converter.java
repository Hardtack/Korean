package me.hardtack.format;
import java.util.Locale;


public interface Converter {
	public String format(FormatSpecifier specifier, int index, Object... args);
	public String format(Locale l, FormatSpecifier specifier, int index, Object... args);
	public boolean shouldHandle(FormatSpecifier specifier);
}
