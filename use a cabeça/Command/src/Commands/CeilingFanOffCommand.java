package Commands;

import Interface.Command;
import Vendedor.CeilingFan;

public class CeilingFanOffCommand implements Command {
	
	private CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceilingFan.off();
	}
	
	public void undo(){
		
	}

}
