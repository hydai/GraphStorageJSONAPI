package edu.iseatel.api.reader;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import edu.iseatel.api.Info;
import edu.iseatel.api.Point;

public class Reader {
	private String jsonString;
	private Info info;
	private ArrayList<Point> points;
	@SuppressWarnings("unused")
	private Reader() {
	}
	public Reader(String jsonString) {
		this.jsonString = jsonString;
		info = new Info();
		points = new ArrayList<Point>();
		init();
	}
	private void init() {
		try {
			JSONObject jsonMother = new JSONObject(jsonString);
			JSONObject jsonInfo = jsonMother.getJSONObject("info");
			info.setUsernameString(jsonInfo.getString("user"));
			JSONArray jsonPoints = jsonMother.getJSONArray("point");
			for (int i = 0; i < jsonPoints.length(); i++) {
				JSONArray jsonPoint = jsonPoints.getJSONArray(i);
				points.add(new Point(
										(float)jsonPoint.getDouble(0),
										(float)jsonPoint.getDouble(1),
										jsonPoint.getInt(2), 
										jsonPoint.getInt(3)));
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Info getInfo() {
		return info;
	}
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
}
