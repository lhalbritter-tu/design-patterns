package observer.weather;

/**
 * A concrete implementation of Observer and DisplayElement, which displays the heat index
 *
 * @author Leo Halbritter {@literal <lhalbritter@student.tgm.ac.at>}
 * Based on <a href="https://resources.oreilly.com/examples/9780596007126/raw/master/examples/HeadFirstDesignPatterns_code102507.zip">Head First - DesignPatterns Example</a>
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
	float heatIndex = 0.0f;
	private WeatherData weatherData;

	/**
	 * Constructor which registers a new {@link WeatherData} which is a concrete implementation of {@link Subject}
	 *
	 * @param weatherData the new {@link WeatherData} to register
	 */
	public HeatIndexDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/**
	 * Concrete implementation of the {@link Observer#update(float, float, float)} method
	 *
	 * @param t the temperature you get from an implementation of {@link Subject}
	 * @param rh the humidity you get from an implementation of {@link Subject}
	 * @param pressure the pressure you get from an implementation of {@link Subject}
	 */
	public void update(float t, float rh, float pressure) {
		heatIndex = computeHeatIndex(t, rh);
		display();
	}

	public void update(){
	    heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
	    display();
    }

	/**
	 * Computes the heat index, called by update, with the new values for temperature and humidity
	 *
	 * @param t the temperature
	 * @param rh the relative humidity
	 * @return the calculated heat index
	 */
	private float computeHeatIndex(float t, float rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
			+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
			+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
			(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
			(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
			(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
			0.000000000843296 * (t * t * rh * rh * rh)) -
			(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;
	}

	/**
	 * Displays the heat index, after it has been calculated
	 */
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}
}
