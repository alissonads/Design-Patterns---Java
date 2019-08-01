package Abstract;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	protected SizeBeverage size;
	
	public String getDescription(){
		return description;
	}
	
	public SizeBeverage getSize(){
		return size;
	}
	
	public void setSize(final SizeBeverage size){
		this.size = size;
	}
	
	public abstract double cost();
}
