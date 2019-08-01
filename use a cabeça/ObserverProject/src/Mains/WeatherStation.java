package Mains;

import Implements.*;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = 
				new StatisticsDisplay(weatherData);
		HeatIndexDisplay heatIndex = new HeatIndexDisplay(weatherData);
		
		/*para que os observadores sejem notificados
		 *antes de tudo deve ser chamada essa função
		 *que autoriza a notificação*/
		weatherData.bind();
		
		weatherData.setMeasurements(80, 65, 34.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		/*remove a autorização de notificação*/
		weatherData.unbind();
	}

}
