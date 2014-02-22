package edu.iseatel.api.creator;

import edu.iseatel.api.GraphStorage;

public class TestCreator {

	public static void main(String[] args) {
		GraphStorage graphStorage = new GraphStorage();
		graphStorage.getInfo().setUsernameString("hydai");
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > 0; j--) {
				for (int k = 125; k < 130; k++) {
					for (int l = 12; l > 10; l--) {
						graphStorage.addPoint(i, j, k, l);
					}
				}
			}
		}
		Creator creator = new Creator(graphStorage.getInfo(), graphStorage.getPoints());
		System.out.println(creator.getJsonOutputString());
	}

}
