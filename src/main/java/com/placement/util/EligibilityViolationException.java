package com.placement.util;

public class EligibilityViolationException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
        return "Student does not satisfy eligibility criteria";
    }
}
