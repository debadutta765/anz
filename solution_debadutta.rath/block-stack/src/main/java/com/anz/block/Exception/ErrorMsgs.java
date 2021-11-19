/**
 * 
 */
package com.anz.block.Exception;

import java.io.Serializable;

/**
 * @author debadrat
 *
 */
public class ErrorMsgs implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2113263233055201675L;
	
	public static final String INVALID_INPUT_LENGTH = "The input array is too large to process";
	public static final String DIMENSION_OUT_OF_RANGE = "The input dimension is out of range";
	public static final String NO_INSTANCE = "The class should not be instantiated";

}
