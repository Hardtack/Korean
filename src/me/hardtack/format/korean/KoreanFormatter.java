package me.hardtack.format.korean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import me.hardtack.format.Converter;
import me.hardtack.format.ExtendableFormatter;

public class KoreanFormatter extends ExtendableFormatter {
	private List<Converter> getKoreanConverters(){
		List<Converter> converters = new LinkedList<Converter>();
		converters.add(new EulRlConverter());
		converters.add(new EgaConverter());
		return converters;
	}
	public KoreanFormatter() {
		super();
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(Appendable a, Locale l) {
		super(a, l);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(Appendable a) {
		super(a);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(File file, String csn, Locale l)
			throws FileNotFoundException, UnsupportedEncodingException {
		super(file, csn, l);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(File file, String csn) throws FileNotFoundException,
			UnsupportedEncodingException {
		super(file, csn);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(File file) throws FileNotFoundException {
		super(file);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(Locale l) {
		super(l);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(OutputStream os, String csn, Locale l)
			throws UnsupportedEncodingException {
		super(os, csn, l);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(OutputStream os, String csn)
			throws UnsupportedEncodingException {
		super(os, csn);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(OutputStream os) {
		super(os);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(PrintStream ps) {
		super(ps);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(String fileName, String csn, Locale l)
			throws FileNotFoundException, UnsupportedEncodingException {
		super(fileName, csn, l);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(String fileName, String csn)
			throws FileNotFoundException, UnsupportedEncodingException {
		super(fileName, csn);
		this.setConverters(this.getKoreanConverters());
	}

	public KoreanFormatter(String fileName) throws FileNotFoundException {
		super(fileName);
		this.setConverters(this.getKoreanConverters());
	}
}
