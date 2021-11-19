/**
 * 
 */
package com.anz.block.helper;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.anz.block.Exception.BlockStackingServiceException;
import com.anz.block.model.Block;

/**
 * @author debadrat
 *
 */
public class BlockStackingServiceHelperTest {

	
	@Test
	public void testValidateBlocksWithValidDimensions() {
		Block b1 = new Block(50,45,20);
		Block[] blockArr = new Block[] {b1};
		assertTrue("The block dimesions should be valid!", BlockStackingServiceHelper.validateBlocks(blockArr));
		
	}
	
	@Test
	public void testValidateBlocksWithInvalidInputLength() {
		Block[] blockArr = new Block[101];
		Exception exception = assertThrows(BlockStackingServiceException.class, () -> {
			BlockStackingServiceHelper.validateBlocks(blockArr);
	    });
		
		String expectedMessage = "The input array is too large to process";
	    String actualMessage = exception.getMessage();

	    assertTrue("The block dimesions should be valid!",actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void testValidateBlocksWithInvalidDimensions() {
		Block b1 = new Block(101,101,101);
		Block[] blockArr = new Block[] {b1};
		Exception exception = assertThrows(BlockStackingServiceException.class, () -> {
			BlockStackingServiceHelper.validateBlocks(blockArr);
	    });
		
		String expectedMessage = "The input dimension is out of range";
	    String actualMessage = exception.getMessage();

	    assertTrue("The block dimesions should be valid!",actualMessage.contains(expectedMessage));
	}
}
