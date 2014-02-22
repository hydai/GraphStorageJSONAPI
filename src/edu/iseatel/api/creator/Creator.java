package edu.iseatel.api.creator;

import java.util.ArrayList;

import edu.iseatel.api.Info;
import edu.iseatel.api.Point;

public class Creator {
	private String jsonOutputString;
	private Info info;
	private ArrayList<Point> points;
	@SuppressWarnings("unused")
	private Creator() {
	}
	public Creator(Info info, ArrayList<Point> points) {
		this.info = info;
		this.points = points;
		init();
	}
	private void init() {
		// init json
		jsonOutputString = "";
		// start json file
		jsonOutputString = jsonOutputString + "{";
		
		// add info
		jsonOutputString = jsonOutputString + loadInfo() + ",";
		
		// add points
		jsonOutputString = jsonOutputString + loadPoints();
		
		// end json file
		jsonOutputString = jsonOutputString + "}";
	}
	private String loadInfo() {
		String infoString = "";
		infoString = infoString + "\"info\":{";
		infoString = infoString + "\"user\":\"" + info.getUsernameString() + "\"";
		infoString = infoString + "}";
		return infoString;
	}
	private String loadPoints() {
		String pointString = "";
		pointString = pointString + "\"point\":{";
		for (int i = 0; i < points.size(); i++) {
			if (i >= 1) {
				pointString = pointString + ",";
			}
			pointString = pointString + "[" + points.get(i).getX() + "," + points.get(i).getY() + "," + points.get(i).getColor() + "]";
		}
		pointString = pointString + "}";
		return pointString;
	}
	public String getJsonOutputString() {
		return jsonOutputString;
	}
}
