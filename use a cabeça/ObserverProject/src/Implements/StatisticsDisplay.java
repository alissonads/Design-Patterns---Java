package Implements;

import Interfaces.DisplayElement;
import Interfaces.Observer;
import Interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement{
	Subject weatherData;
	float temperature;
	float max;
	float min;
	
	public StatisticsDisplay(final Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		temperature = max = min = 0;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		max = Math.max(temperature, max);
		min = min == 0.0f? Math.min(temperature, max):
					       Math.min(temperature, min);
		float avg = min + (max - min)/2;
		System.out.println("AVG/MAX/Min temperature = " + avg + 
						   "/" + max + "/" + min);
	}

	@Override
	public void update(final Subject subject, 
			   		   final Object ...args) {
		// TODO Auto-generated method stub
		if(args == null && subject instanceof WeatherData){
			WeatherData auxWeatherData = (WeatherData)subject;
			this.temperature = auxWeatherData.getTemperature();
		}
		else{
			this.temperature = (float)args[0];
		}
		
		display();
	}

}
