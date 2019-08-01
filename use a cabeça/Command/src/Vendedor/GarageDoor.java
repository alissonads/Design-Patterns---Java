package Vendedor;

public class GarageDoor extends Obj{
	
	public GarageDoor(String name){
		super(name);
	}
	
	public void up(){
		System.out.println("Garage door is Open");
	}
	
	public void down(){
		System.out.println("Garage door down");
	}
	
	public void stop(){
		System.out.println("Door of stopped garage");
	}
	
	public void lightOn(){
		System.out.println("Light of the garage on");
	}
	
	public void lightOff(){
		System.out.println("Light of the garage off");
	}
}
