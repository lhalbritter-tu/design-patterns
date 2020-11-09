package observer.weather;

import java.util.*;

/**
 * Concrete implementation of {@link Subject}
 */
public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;

    /**
     * Constructor, initializes the observers list
     */
	public WeatherData() {
		observers = new ArrayList();
	}

    /**
     * {@link Subject#registerObserver(Observer)}
     * @param o instance of concrete implementation of {@link Observer}
     */
	public void registerObserver(Observer o) {
		observers.add(o);
	}

    /**
     * {@link Subject#removeObserver(Observer)}
     * @param o instance of concrete implemenation of {@link Observer}
     */
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

    /**
     * {@link Subject#notifyObservers()}
     */
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

    /**
     * calls this implementation's {@link Subject#notifyObservers()}
     */
	public void measurementsChanged() {
		notifyObservers();
	}

    /**
     * Sets the fields given
     *
     * @param temperature the temperature at the moment
     * @param humidity the current humidity
     * @param pressure the current pressure
     */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

    /**
     * Returns the current temperature
     *
     * @return the value of the temperature field
     */
	public float getTemperature() {
		return temperature;
	}

    /**
     * Returns the current humidity
     *
     * @return the value of the humidity field
     */
	public float getHumidity() {
		return humidity;
	}

    /**
     * Returns the current pressure
     *
     * @return the value of the pressure field
     */
	public float getPressure() {
		return pressure;
	}
}
