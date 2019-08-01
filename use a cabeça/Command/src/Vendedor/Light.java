package Vendedor;

public class Light extends Obj{
	
	public Light(String name){
		super(name);
	}
	
	public void on(){
		System.out.println("Light is on");
	}
	
	public void off(){
		System.out.println("Light is off");
	}
}
