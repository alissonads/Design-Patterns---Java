package Detoretors;

import Abstract.Beverage;
import Abstract.CondimentDecorator;
import Abstract.SizeBeverage;

public class Whip extends CondimentDecorator {

	private Beverage beverage;
	
	public Whip(final Beverage beverage){
		this.beverage = beverage;
		description = "Whip";
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", " + description;
	}

	public SizeBeverage getSize(){
		return beverage.getSize();
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.10 + beverage.cost();
	}

}
