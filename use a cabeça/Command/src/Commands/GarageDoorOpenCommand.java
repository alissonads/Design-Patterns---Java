package Commands;

import Interface.Command;
import Vendedor.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(final GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}

	public void undo(){
		
	}
}
