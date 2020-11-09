package observer.weather;

import java.util.*;

/**
 * A concrete implementation of {@link Observer} and {@link DisplayElement}, which displays the current pressure, as well as the last pressure measured
 *
 * @author Leo Halbritter {@literal <lhalbritter@student.tgm.ac.at>}
 * Based on <a href="https://resources.oreilly.com/examples/9780596007126/raw/master/examples/HeadFirstDesignPatterns_code102507.zip">Head First - DesignPatterns Example</a>
 */
public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	/**
	 * Constructor, which registers a new {@link WeatherData} which is a concrete implementation of {@link Subject}
	 *
	 * @param weatherData the new {@link WeatherData} Subject to register
	 */
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/**
	 * Concrete implementation of the {@link Observer#update(float, float, float)} method
	 *
	 * @param temp the temperature you get from an implementation of {@link Subject}
	 * @param humidity the humidity you get from an implementation of {@link Subject}
	 * @param pressure the pressure you get from an implementation of {@link Subject}
	 */
	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void update(){
	    lastPressure = currentPressure;
	    currentPressure = weatherData.getPressure();

	    display();
    }

	/**
	 * Prints the weather forecast, depending on the current Pressure and last Pressure measured to the console
	 */
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
