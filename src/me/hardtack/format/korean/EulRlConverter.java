package me.hardtack.format.korean;

import java.util.IllegalFormatConversionException;
import java.util.Locale;

import kr.viewide.synchrok.Eulrlega;

import me.hardtack.format.Converter;
import me.hardtack.format.FormatSpecifier;

public class EulRlConverter implements Converter {

	@Override
	public String format(FormatSpecifier specifier, int index, Object... args) {
		if (specifier.getArgumentIndex() != null) {
			index = specifier.getArgumentIndex() - 1;
		}
		Object arg = args[index];
		if (!(arg instanceof String)) {
			char c = ' ';
			String conversion = specifier.getConversion();
			if (conversion.length() > 0) {
				c = conversion.charAt(0);
			}
			throw new IllegalFormatConversionException(c, arg.getClass());
		}
		String str = (String)arg;
		return str + Eulrlega.getEulrl(str);
	}

	@Override
	public String format(Locale l, FormatSpecifier specifier, int index,
			Object... args) {
		return this.format(specifier, index, args);
	}

	@Override
	public boolean shouldHandle(FormatSpecifier specifier) {
		return specifier.getConversion().equals("À»");
	}

}
