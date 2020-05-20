package com.ashugupta.SpringIOC.Models;

public class Screen {
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public Screen(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Screen [length=" + length + ", breadth=" + breadth + "]\n";
	}
	
	

}
