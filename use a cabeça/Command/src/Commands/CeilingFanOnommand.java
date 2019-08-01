package Commands;

import Interface.Command;
import Vendedor.CeilingFan;

public class CeilingFanOnommand implements Command {

	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanOnommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	public void undo(){
		if(prevSpeed == CeilingFan.HIGH){
			ceilingFan.high();
		}
		if(prevSpeed == CeilingFan.MEDIUM){
			ceilingFan.medium();		
		}
		if(prevSpeed == CeilingFan.LOW){
			ceilingFan.low();
		}
		if(prevSpeed == CeilingFan.OFF){
			ceilingFan.off();
		}

	}
}
