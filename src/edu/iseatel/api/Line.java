package edu.iseatel.api;

import java.util.ArrayList;

public class Line {
	private int groupID;
	private ArrayList<Point> pointList;
	public Line() {
		groupID = 0;
		pointList = new ArrayList<Point>();
	}
	public Line(int groupID) {
		this.groupID = groupID;
		pointList = new ArrayList<Point>();
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public void addPoint(int x, int y) {
		Point pt = new Point(x, y);
		pointList.add(pt);
	}
	public ArrayList<Point> getPointList() {
		return pointList;
	}
}
