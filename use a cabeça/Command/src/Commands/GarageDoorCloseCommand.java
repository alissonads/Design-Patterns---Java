package Commands;

import Interface.Command;
import Vendedor.GarageDoor;

public class GarageDoorCloseCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.down();
	}

	public void undo(){
		
	}
}
