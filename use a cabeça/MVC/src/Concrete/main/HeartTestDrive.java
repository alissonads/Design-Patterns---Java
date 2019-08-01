package Concrete.main;

import Concrete.controller.HeartController;
import Concrete.model.HeartModel;
import Interfaces.ControllerInterface;

public class HeartTestDrive {

	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}

}
