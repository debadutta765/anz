/**
 * 
 */
package com.anz.block.service;

import java.util.Arrays;

import com.anz.block.helper.BlockStackingServiceHelper;
import com.anz.block.model.Block;

/**
 * @author Debadutta Rath
 *
 */
public class BlockStackingServiceImpl implements BlockStackingService {

	@Override
	public int getMaxHeight(Block[] blocks) {
		// Validate the input size and the dimensions of the block
		BlockStackingServiceHelper.validateBlocks(blocks);

		// Sort the dimensions of the block so that the height becomes maximum
		for (Block block : blocks) {
			Arrays.sort(block.getDimensions());
		}
		// Sort the blocks according to the dimensions
		Arrays.sort(blocks);
		return BlockStackingServiceHelper.stackBlocksAndReturnMaxHeight(blocks);
	}
}
