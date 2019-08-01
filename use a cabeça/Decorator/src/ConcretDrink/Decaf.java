package ConcretDrink;

import Abstract.Beverage;

public class Decaf extends Beverage {

	public Decaf(){
		description = "Decaf";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
