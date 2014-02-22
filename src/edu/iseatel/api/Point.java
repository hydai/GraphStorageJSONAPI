package edu.iseatel.api;

public class Point {
	private float x, y;
	private int color, action;
	public Point() {
		color = 0;
		action = 0;
		x = y = -1;
	}
	public Point(float x, float y, int action, int color) {
		this.x = x;
		this.y = y;
		this.action = action;
		this.color = color;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public int getColor() {
		return color;
	}
	public int getAction() {
		return action;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setAction(int action) {
		this.action = action;
	}
	public void setColor(int color) {
		this.color = color;
	}
}
