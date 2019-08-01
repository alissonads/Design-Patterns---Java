package ConcretDrink;

import Abstract.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		description = "House Blend";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
