package Detoretors;

import Abstract.Beverage;
import Abstract.CondimentDecorator;
import Abstract.SizeBeverage;

public class Soy extends CondimentDecorator {

	private Beverage beverage;
	
	public Soy(final Beverage beverage){
		this.beverage = beverage;
		description = "Soy";
		size = SizeBeverage.TALL;
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

		if(getSize() == SizeBeverage.GRANDE){
			return 0.15 + beverage.cost();
		}
		if(getSize() == SizeBeverage.VENTI){
			return 0.20 + beverage.cost();
		}
		
		return 0.10 + beverage.cost();
	}

}
