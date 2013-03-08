package me.hardtack.format;
public class FormatSpecifier {
	private Integer argumentIndex;
	private String flags;
	private Integer width;
	private Integer precision;
	private String conversion;

	public String toString() {
		StringBuilder sb = new StringBuilder("%");
		if (this.argumentIndex != null) {
			sb.append(this.argumentIndex);
			sb.append("$");
		}
		if (this.flags != null) {
			sb.append(this.flags);
		}
		if (this.width != null) {
			sb.append(this.width);
		}
		if (this.precision != null) {
			sb.append(".");
			sb.append(this.precision);
		}
		sb.append(this.conversion);
		return sb.toString();
	}

	public FormatSpecifier(Integer argumentIndex, String flags, Integer width,
			Integer precision, String conversion) {
		this.argumentIndex = argumentIndex;
		this.flags = flags;
		this.width = width;
		this.precision = precision;
		this.setConversion(conversion);
	}

	public FormatSpecifier(String argumentIndexString, String flags,
			String widthString, String precisionString, String conversion) {
		Integer argumentIndex = null;
		Integer width = null;
		Integer precision = null;

		if (argumentIndexString != null && argumentIndexString.endsWith("$")) {
			argumentIndex = new Integer(argumentIndexString.substring(0,
					argumentIndexString.length() - 1));
		}

		if (widthString != null) {
			width = new Integer(widthString);
		}

		if (precisionString != null && precisionString.startsWith(".")) {
			precision = new Integer(precisionString.substring(1));
		}

		this.argumentIndex = argumentIndex;
		this.flags = flags;
		this.width = width;
		this.precision = precision;
		this.setConversion(conversion);

	}

	public Integer getArgumentIndex() {
		return argumentIndex;
	}

	public void setArgumentIndex(Integer argumentIndex) {
		this.argumentIndex = argumentIndex;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public String getConversion() {
		return conversion;
	}

	public void setConversion(String conversion) {
		if (conversion == null) {
			throw new NullPointerException("Conversion cannot be null");
		}
		this.conversion = conversion;
	}
}
