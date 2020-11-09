package observer.weather;

import java.util.*;

/**
 * A concrete implementation of Observer and DisplayElement, which displays temperature statistics
 *
 * @author Leo Halbritter {@literal <lhalbritter@student.tgm.ac.at>}
 * Based on <a href="https://resources.oreilly.com/examples/9780596007126/raw/master/examples/HeadFirstDesignPatterns_code102507.zip">Head First - DesignPatterns Example</a>
 */
public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	/**
	 * Constructor which registers a new {@link WeatherData} which is a concrete implementation of {@link Subject}
	 *
	 * @param weatherData the new {@link WeatherData} to register
	 */
	public StatisticsDisplay(WeatherData weatherData) {
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
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void update(){
	    float temp = weatherData.getTemperature();
	    tempSum += temp;
	    numReadings++;

	    if(temp > maxTemp) {
            maxTemp = temp;
        }

        if(temp < minTemp){
            minTemp = temp;
        }

        display();
    }

	/**
	 * Displays the average, max and min temperature, after the temperature has been updated
	 */
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
