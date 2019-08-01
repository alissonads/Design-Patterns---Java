package Controle_Remoto;

import Commands.*;
import Vendedor.*;


public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = factory();
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}

	public static RemoteControl factory(){
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light KitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand KitchenLightOn = new LightOnCommand(KitchenLight);
		LightOffCommand KitchenLightOff = new LightOffCommand(KitchenLight);
		
		CeilingFanOnommand ceilingFanOn = new CeilingFanOnommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, KitchenLightOn, KitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
		remoteControl.setCommand(4, stereoOn, stereoOff);
		
		return remoteControl;
	}
}
