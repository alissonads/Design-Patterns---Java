package Controle_Remoto;

import Commands.GarageDoorOpenCommand;
import Commands.LightOnCommand;
import Vendedor.GarageDoor;
import Vendedor.Light;

public class RemoteControlTest {
	public static void main(String []args){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
