package Concrete.main;

import Concrete.controller.BeatController;
import Concrete.model.BeatModel;
import Interfaces.BeatModelInterface;
import Interfaces.ControllerInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}

}
