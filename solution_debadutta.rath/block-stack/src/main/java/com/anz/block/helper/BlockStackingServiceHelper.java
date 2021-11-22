/**
 * 
 */
package com.anz.block.helper;

import com.anz.block.Exception.BlockStackingServiceException;
import com.anz.block.Exception.ErrorMsgs;
import com.anz.block.model.Block;
import com.anz.block.util.BlockServiceUtil;

/**
 * @author debadrat
 *
 */
public class BlockStackingServiceHelper {
	
	/**
	 * Sums up and returns the max height after stacking the blocks
	 * @param blocks
	 * @return maxHeight
	 */
	public static int stackBlocksAndReturnMaxHeight(Block[] blocks) {
		int[] heights = new int[blocks.length];
		int maxHeight = 0;
		
		for (int i = 0; i < blocks.length; i++) {
			heights[i] = blocks[i].getHeight();
			maxHeight = maxHeight >= heights[i] ? maxHeight : heights[i];
            for (int j = 0; j<i; j++)
                if ((blocks[i].getWidth() >= blocks[j].getWidth()) 
                	&& (blocks[i].getLength() >= blocks[j].getLength())
                	&& (blocks[i].getHeight() >= blocks[j].getHeight())){
                		heights[i] = Math.max(heights[i], (blocks[i].getHeight() + heights[j]));
                		maxHeight = Math.max(maxHeight, heights[i]);
                	}
        }
		return maxHeight;
	}

	/**
	 * Validates the input size and the length,width,height
	 * of the individual block
	 * @param blocks
	 */
	public static boolean validateBlocks(Block[] blocks) {
		if(blocks == null || blocks.length < 1 || blocks.length > 100) {
			throw new BlockStackingServiceException(ErrorMsgs.INVALID_INPUT_LENGTH);
		}
		for(Block block:blocks) {
			if(!BlockServiceUtil.isValidBlockInput(block)) {
				throw new BlockStackingServiceException(ErrorMsgs.DIMENSION_OUT_OF_RANGE);
			}
			
		}
		return true;
	}

}
