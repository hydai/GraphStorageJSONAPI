package edu.iseatel.api;

import java.util.ArrayList;


public class GraphStorage {
	private static int lineNumber = 0;
	private Info info;
	private ArrayList<Point> points;
	private ArrayList<Line> lines;
	public GraphStorage() {
		info = new Info();
		points = new ArrayList<Point>();
		lines = new ArrayList<Line>();
	}
	public void addPoint(int x, int y) {
		Point pt = new Point(x, y);
		points.add(pt);
	}
	public int addLine() {
		lines.add(new Line(lineNumber));
		lineNumber++;
		return lineNumber-1;
	}
	
	public Info getInfo() {
		return info;
	}
	public Line getLine(int lineNumber) {
		return lines.get(lineNumber);
	}
	public ArrayList<Line> getLines() {
		return lines;
	}
	public ArrayList<Point> getPoints() {
		return points;
	}
}
