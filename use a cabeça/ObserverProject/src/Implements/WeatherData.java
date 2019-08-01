package Implements;

import java.util.ArrayList;

import Abstracts.AbstractSubject;
import Interfaces.Observer;
import Interfaces.Subject;

public class WeatherData extends AbstractSubject {

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		super();
	}
	
	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}
	
	public void setMeasurements(final float temperature, 
							    final float humidity, 
							    final float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		apply();
	}

	public float []getArgs(){
		return new float[]{temperature, humidity, pressure};
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		notifyObservers();
		//notifyObservers(temperature, humidity, pressure);
	}
}
