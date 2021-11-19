package com.anz.block.model;

/**
 * @author Debadutta
 * 
 * This is the model class for the Block.
 *
 */
public class Block implements Comparable<Block>{
	int[] dimensions = new int[3];

	public Block( int length, int width, int height) {
		this.dimensions = new int[]{length, width, height};
	}
	
	public Block() {
		super();
	}
	
	/**
	 * @return the dimension array of the block
	 */
	public int[] getDimensions() {
		return dimensions;
	}

	/**
	 * @param dimensions
	 * @return null
	 */
	public void setDimensions(int[] dimensions) {
		this.dimensions = dimensions;
	}

	/**
	 * @return the length of the block
	 */
	public int getLength() {
		return dimensions[0];
	}

	/**
	 * @param length length to set
	 * @return null
	 */
	public void setLength(int length) {
		this.dimensions[0] = length;
	}
	
	/**
	 * @return the width of the block
	 */
	public int getWidth() {
		return dimensions[1];
	}
	
	/**
	 * @param width width to set
	 * @return null
	 */
	public void setWidth(int width) {
		this.dimensions[1] = width;
	}


	/**
	 * @return the heigth of the block
	 */
	public int getHeight() {
		return dimensions[2];
	}

	/**
	 * @param height height to set
	 * @return null
	 */
	public void setHeight(int height) {
		this.dimensions[2] = height;
	}
	
	/**
	 * Custom comparator to sort the blocks in the preferred sorting order
	 * with
	 * 1- Lengthwise
	 * 2- Widthwise
	 * 3- Heigthwise
	 * @param block instance of the block
	 * @return int
	 */
	@Override
	public int compareTo(Block block) {
		return (this.getLength() + this.getWidth() + this.getHeight()) - 
		(block.getLength() + block.getWidth() + block.getHeight());
	}
}
