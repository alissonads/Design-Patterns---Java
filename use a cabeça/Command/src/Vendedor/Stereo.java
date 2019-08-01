package Vendedor;

public class Stereo extends Obj{
	
	
	public Stereo(String name){
		super(name);
	}
	
	public void on(){
		System.out.println("Stero is on");
	}
	
	public void off(){
		System.out.println("Stereo is off");	
	}
	
	public void setCd(){
		System.out.println("Add the CD");
	}
	
	public void setDvd(){
		System.out.println("Add the DVD");
	}
	
	public void setRadiio(){
		System.out.println("Add station off radio");
	}
	
	public void setVolume(int v){
		System.out.println("volume of the sound: " + v);
	}
}
