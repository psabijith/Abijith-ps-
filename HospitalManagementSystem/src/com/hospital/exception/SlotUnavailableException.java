package com.hospital.exception;

public class SlotUnavailableException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4;

	public SlotUnavailableException(String message) {
		super(message);
	}
}
