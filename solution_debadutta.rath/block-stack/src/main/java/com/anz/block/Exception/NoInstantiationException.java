/**
 * 
 */
package com.anz.block.Exception;

/**
 * @author debadrat
 *
 */
public class NoInstantiationException extends BlockStackingServiceException{

	/**
	 * @param noInstance
	 */
	public NoInstantiationException(String message) {
		super(message);
	}

}
