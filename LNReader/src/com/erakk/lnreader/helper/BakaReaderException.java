package com.erakk.lnreader.helper;

public class BakaReaderException extends Exception {
	private static final long serialVersionUID = -2165746320273542629L;
	public static final int OFFLINE = -1000;
	public static final int NULL_NOVELDAO = -2000;
	public static final int EMPTY_IMAGE = -3000;
	public static final int EMPTY_CONTENT = -4000;
	public static final int LANG_NOT_SUPPORTED = -5000;

	private final int errorCode;

	public BakaReaderException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public BakaReaderException(String message, int errorCode, Exception ex) {
		super(message, ex);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	@Override
	public String toString() {
		if (super.getCause() == null)
			return String.format("Error Code=%s: %s", this.errorCode, super.getMessage());
		return String.format("Error Code=%s: %s. Inner Exception: %s", this.errorCode, super.getMessage(), super.getCause().getMessage());
	}
}
