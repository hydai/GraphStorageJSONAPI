package edu.iseatel.api.creator;

import edu.iseatel.api.GraphStorage;

public class TestCreator {

	public static void main(String[] args) {
		GraphStorage graphStorage = new GraphStorage();
		graphStorage.getInfo().setUsernameString("hydai");
		int indexOfLineOne = graphStorage.addLine();
		for (int i = 0; i < 10; i++) {
			graphStorage.getLine(indexOfLineOne).addPoint(i, i);
		}
		int indexOfLineTwo = graphStorage.addLine();
		for (int i = 10; i > 0; i--) {
			graphStorage.getLine(indexOfLineTwo).addPoint(i, i);
		}
		graphStorage.addPoint(1024, 768);
		graphStorage.addPoint(123, 765);
		Creator creator = new Creator(graphStorage.getInfo(), graphStorage.getPoints(), graphStorage.getLines());
		System.out.println(creator.getJsonOutputString());
	}

}
