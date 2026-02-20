package com.placement.util;

public class ActiveApplicationsExistException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
        return "Active applications exist – deletion not allowed";
    }
}
