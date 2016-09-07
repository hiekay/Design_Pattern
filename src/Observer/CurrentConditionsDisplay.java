package Observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperture;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperture = weatherData.getTemperture();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display(){
		System.out.println("Current conditions:" + temperture
				+ "F degrees adn " + humidity + "% humidity");
	}

}

interface DisplayElement {
	public void display();
}