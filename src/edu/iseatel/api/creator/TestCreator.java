package edu.iseatel.api.creator;

import edu.iseatel.api.GraphStorage;

public class TestCreator {

	public static void main(String[] args) {
		GraphStorage graphStorage = new GraphStorage();
		graphStorage.getInfo().setUsernameString("hydai");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 123; k < 130; k++) {
					graphStorage.addPoint(i, j, k);
				}
			}
		}
		Creator creator = new Creator(graphStorage.getInfo(), graphStorage.getPoints());
		System.out.println(creator.getJsonOutputString());
	}

}
