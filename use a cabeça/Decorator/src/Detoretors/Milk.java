package Detoretors;

import Abstract.Beverage;
import Abstract.CondimentDecorator;
import Abstract.SizeBeverage;

public class Milk extends CondimentDecorator {

	private Beverage beverage;
	
	public Milk(final Beverage beverage){
		this.beverage = beverage;
		description = "Milk";
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
