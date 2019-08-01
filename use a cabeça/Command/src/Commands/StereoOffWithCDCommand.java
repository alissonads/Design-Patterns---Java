package Commands;

import Interface.Command;
import Vendedor.Stereo;

public class StereoOffWithCDCommand implements Command {

	Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

	public void undo(){
		
	}
}
