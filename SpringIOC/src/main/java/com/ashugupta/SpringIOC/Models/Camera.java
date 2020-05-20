package com.ashugupta.SpringIOC.Models;

public class Camera {
	private int no_of_pixels;

	public int getNo_of_pixels() {
		return no_of_pixels;
	}

	public void setNo_of_pixels(int no_of_pixels) {
		this.no_of_pixels = no_of_pixels;
	}

	public Camera(int no_of_pixels) {
		this.no_of_pixels = no_of_pixels;
	}

	@Override
	public String toString() {
		return "Camera [no_of_pixels=" + no_of_pixels + "]\n";
	}
	


}
