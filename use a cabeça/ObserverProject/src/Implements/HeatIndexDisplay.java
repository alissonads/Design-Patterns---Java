package Implements;

import Interfaces.DisplayElement;
import Interfaces.Observer;
import Interfaces.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {

	private Subject weatherData;
	private float temperature;
	private float humidity;
	
	public HeatIndexDisplay(final Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Heat index is " + heatIndex());
		System.out.println();
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

	float heatIndex(){
		float heatindex = (
					16.923f + 1.85212f * (float)Math.pow(10.0, -1) * temperature + 5.37941f * humidity
					- 1.00254f * (float)Math.pow(10.0, -1) * temperature * humidity + 9.41695f * (float)Math.pow(10.0, -3) *
					(float)Math.pow(temperature, 2) + 7.28898f * (float)Math.pow(10.0, -3) * (float)Math.pow(humidity, 2) + 3.45372f * (float)Math.pow(10.0, -4) *
					(float)Math.pow(temperature, 2) * humidity - 8.14971f * (float)Math.pow(10.0, -4) * temperature * (float)Math.pow(humidity, 2) + 1.02102f
					* (float)Math.pow(10.0, -5) * (float)Math.pow(temperature, 2) * (float)Math.pow(humidity, 2) - 3.8646f *  (float)Math.pow(10.0, -5) * (float)Math.pow(temperature, 3) +
					2.91583f * (float)Math.pow(10.0, -5) * (float)Math.pow(humidity, 3) + 1.42721f * (float)Math.pow(10.0, -6) * (float)Math.pow(temperature, 3) * 
					humidity + 1.97483f * (float)Math.pow(10.0, -7) * temperature * (float)Math.pow(humidity, 3) - 2.18429f *
				    (float)Math.pow(10.0, -8) * (float)Math.pow(temperature, 3) * (float)Math.pow(humidity, 2) + 8.43296f * (float)Math.pow(10.0, -10) * (float)Math.pow(temperature, 2) * (float)Math.pow(humidity, 3)
					- 4.81975f * (float)Math.pow(10.0, -11) * (float)Math.pow(temperature, 3) * (float)Math.pow(humidity, 3)
				);
		return heatindex;
	}
}
