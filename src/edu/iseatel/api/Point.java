package edu.iseatel.api;

public class Point {
	private int x, y;
	private int color;
	public Point() {
		color = 0;
		x = y = -1;
	}
	public Point(int x, int y, int color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getColor() {
		return color;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setColor(int color) {
		this.color = color;
	}
}
