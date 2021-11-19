/**
 * 
 */
package com.anz.block.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.anz.block.model.Block;

/**
 * @author debadrat
 *
 */
public class BlockStackingServiceTest {
	
	private static BlockStackingService service = null;
	
	@BeforeClass
	public static void setUp() {
		service = new BlockStackingServiceImpl();
	}
	
	@Test
	public void testGetMaxHeight() {
		Block b1 = new Block(50,45,20);
		Block b2 = new Block(95,37,53);
		Block b3 = new Block(45,23,12);
		Block[] blockArr = new Block[] {b1,b2,b3};

		Arrays.sort(b1.getDimensions());
		Arrays.sort(b2.getDimensions());
		Arrays.sort(b3.getDimensions());
		
		int expectedHeight = b1.getHeight() + b2.getHeight() +b3.getHeight();
		assertEquals("The expected max height should match the actual max height", expectedHeight, service.getMaxHeight(blockArr));
		
	}
	
	@Test
	public void testGetMaxHeightWithSimilarDimensions() {
		int dim1 = 7;
		int dim2 = 17;
		int dim3 = 11;
		
		Block b1 = new Block(dim1,dim2,dim3);
		Block b2 = new Block(dim1,dim3,dim2);
		Block b3 = new Block(dim2,dim1,dim3);
		Block b4 = new Block(dim2,dim3,dim1);
		Block b5 = new Block(dim3,dim2,dim1);
		Block b6 = new Block(dim3,dim1,dim2);
		
		Block[] blockArr = new Block[] {b1,b2,b3,b4,b5,b6};
		
		int expectedHeight = 17*6;
		assertEquals("The expected max height should match the actual max height", expectedHeight, service.getMaxHeight(blockArr));
	}
	
	@Test
	public void testGetMaxHeightWithNoPossibleStack() {
		
		Block b1 = new Block(38,25,45);
		Block b2 = new Block(76,35,3);
		Block[] blockArr = new Block[] {b1,b2};

		Arrays.sort(b1.getDimensions());
		Arrays.sort(b2.getDimensions());
		
		int expectedHeight = Math.max(b1.getHeight(), b2.getHeight());
		assertEquals("The expected max height should match the actual max height", expectedHeight, service.getMaxHeight(blockArr));
		
	}



}
