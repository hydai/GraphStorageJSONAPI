package edu.iseatel.api;

import java.util.ArrayList;


public class GraphStorage {
	private Info info;
	private ArrayList<Point> points;
	public GraphStorage() {
		info = new Info();
		points = new ArrayList<Point>();
	}
	public void addPoint(float x, float y, int action, int color) {
		Point pt = new Point(x, y, action, color);
		points.add(pt);
	}
	
	public Info getInfo() {
		return info;
	}
	public ArrayList<Point> getPoints() {
		return points;
	}
}
