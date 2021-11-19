/**
 * 
 */
package com.anz.block.client;

import com.anz.block.model.Block;
import com.anz.block.service.BlockStackingService;
import com.anz.block.service.BlockStackingServiceImpl;

/**
 * @author debadrat
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Block b1 = new Block(50,45,20);
		Block b2 = new Block(95,37,53);
		Block b3 = new Block(45,23,12);
		Block[] blockArr = new Block[] {b1,b2,b3};
		BlockStackingService service = new BlockStackingServiceImpl();
		Block b4 = new Block(38,25,45);
		Block b5 = new Block(76,35,3);
		Block[] blockArr1 = new Block[] {b4,b5};
		Block b6 = new Block(7,11,17);
		Block b7 = new Block(7,17,11);
		Block b8 = new Block(11,7,17);
		Block b9 = new Block(11,17,7);
		Block b10 = new Block(17,7,11);
		Block b11 = new Block(17,11,7);
		Block[] blockArr2 = new Block[] {b6,b7,b8,b9,b10,b11};
		System.out.println("The max height is "+service.getMaxHeight(blockArr)+"  "+ service.getMaxHeight(blockArr1)+"  "+ service.getMaxHeight(blockArr2));
		

	}

}
