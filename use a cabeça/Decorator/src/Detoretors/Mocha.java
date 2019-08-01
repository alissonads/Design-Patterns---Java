package Detoretors;

import Abstract.Beverage;
import Abstract.CondimentDecorator;
import Abstract.SizeBeverage;

public class Mocha extends CondimentDecorator {

	private Beverage beverage;
	
	public Mocha(final Beverage beverage){
		this.beverage = beverage;
		description = "Mocha";
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
		return 0.20 + beverage.cost();
	}

}
