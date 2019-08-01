package Drinks;

public abstract class CaffeineBeverage {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		
		if(customerWantsCondiments())
			addCondiments();
	}
	
	abstract public void brew();
	
	abstract public void addCondiments();
	
	public void boilWater()
	{
		System.out.println("Boiling water");
	}
	
	public void pourInCup()
	{
		System.out.println("Pouring into cup");
	}
	
	//metodo gancho ou hook
	boolean customerWantsCondiments(){
		return true;
	}
}
