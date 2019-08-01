package Commands;

import Interface.Command;
import Vendedor.Stereo;

public class StereoOnWithCDCommand implements Command {
	
	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCd();
		stereo.setVolume(10);
	}

	public void undo(){
		
	}
}
