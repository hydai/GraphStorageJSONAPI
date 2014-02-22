package edu.iseatel.api.creator;

import java.util.ArrayList;

import edu.iseatel.api.Info;
import edu.iseatel.api.Line;
import edu.iseatel.api.Point;

public class Creator {
	private String jsonOutputString;
	private Info info;
	private ArrayList<Point> points;
	private ArrayList<Line> lines;
	@SuppressWarnings("unused")
	private Creator() {
	}
	public Creator(Info info, ArrayList<Point> points, ArrayList<Line> lines) {
		this.info = info;
		this.points = points;
		this.lines = lines;
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
		jsonOutputString = jsonOutputString + loadPoints() + ",";
		
		// add lines
		jsonOutputString = jsonOutputString + loadLines();
		
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
			pointString = pointString + "[" + points.get(i).getX() + "," + points.get(i).getY() + "]";
		}
		pointString = pointString + "}";
		return pointString;
	}
	private String loadLines() {
		String lineString = "";
		lineString = lineString + "\"line\":{";
		for (int i = 0; i < lines.size(); i++) {
			if (i >= 1) {
				lineString = lineString + ",";
			}
			for (int j = 0; j < lines.get(i).getPointList().size(); j++) {
					if (j >= 1) {
						lineString = lineString + ",";
					}
					lineString = lineString + "[" + lines.get(i).getGroupID() + "," 
						+ lines.get(i).getPointList().get(j).getX() + "," 
						+ lines.get(i).getPointList().get(j).getY() + "]";
			}
		}
		lineString = lineString + "}";
		return lineString;
	}
	public String getJsonOutputString() {
		return jsonOutputString;
	}
}
