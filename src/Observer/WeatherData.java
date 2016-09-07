package Observer;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperture;   //�¶�
	private float humidity;     //ʪ��
	private float pressure;     //��ѹ
	
	public WeatherData(){}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperture, 
			float humidity, float pressure){
		this.temperture = temperture;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperture() {
		return temperture;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	
}
