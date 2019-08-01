package Controle_Remoto;

import Interface.Command;

public class SimpleRemoteControl {

	Command slot;
	
	public SimpleRemoteControl(){}
	
	public void setCommand(final Command command){
		slot = command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
}
