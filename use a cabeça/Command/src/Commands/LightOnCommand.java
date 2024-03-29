package Commands;

import Interface.Command;
import Vendedor.Light;

public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	public void undo(){
		light.off();
	}
}
