/**
 * 
 */
package com.anz.block.util;

import com.anz.block.Exception.ErrorMsgs;
import com.anz.block.Exception.NoInstantiationException;
import com.anz.block.model.Block;

/**
 * @author debadrat
 *
 */
public final class BlockServiceUtil {
	private BlockServiceUtil() {
		throw new NoInstantiationException(ErrorMsgs.NO_INSTANCE);
	}

	public static <T extends Block> boolean isValidBlockInput(T input) {
		Block block = (Block) input;
		if((block.getLength() < 1 || block.getLength() > 100) &&
				(block.getWidth() < 1 || block.getWidth() > 100) &&
				(block.getHeight() < 1 || block.getHeight() > 100))
			return false;
		
		return true;
	}

}
