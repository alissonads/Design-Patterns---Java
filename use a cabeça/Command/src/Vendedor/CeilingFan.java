package Vendedor;

public class CeilingFan extends Obj {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private int speed;
	
	public CeilingFan(String name) {
		super(name);
		speed = OFF;
	}

	public void high(){
		speed = HIGH;
	}
	
	public void medium(){
		speed = MEDIUM;
	}

	public void low(){
		speed = LOW;
	}
	
	public void off(){
		speed = OFF;
		System.out.println("Ceiling Fan is off");
	}
	
	public int getSpeed(){
		return speed;
	}
}
