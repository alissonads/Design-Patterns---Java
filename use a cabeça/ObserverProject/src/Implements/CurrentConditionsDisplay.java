package Implements;

import Interfaces.DisplayElement;
import Interfaces.Observer;
import Interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(final Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	void setSubject(final Subject subject){
		weatherData = subject;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condition: " + temperature + 
						   "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(final Subject subject, 
			   		   final Object ...args) {
		// TODO Auto-generated method stub

		if(args == null && subject instanceof WeatherData){
			WeatherData auxWeatherData = (WeatherData)subject;
			this.temperature = auxWeatherData.getTemperature();
			this.humidity = auxWeatherData.getHumidity();
		}
		else{
			this.temperature = (float)args[0];
			this.humidity = (float)args[1];
		}
		
		display();
	}

}
