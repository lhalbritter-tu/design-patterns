package observer.weather;

/**
 * A concrete implementation of Observer and DisplayElement, which displays the temperature and humidity, when they are changed.
 *
 * @author Leo Halbritter {@literal <lhalbritter@student.tgm.ac.at>}
 * Based on <a href="https://resources.oreilly.com/examples/9780596007126/raw/master/examples/HeadFirstDesignPatterns_code102507.zip">Head First - DesignPatterns Example</a>
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	/**
	 * Constructor, which registers a new concrete implementation of {@link Subject} to this Observer
	 *
	 * @param weatherData the Subject to register
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/**
	 * Concrete implementation of the {@link Observer#update(float, float, float)} method
	 *
	 * @param temperature the temperature you get from an implementation of {@link Subject}
	 * @param humidity the humidity you get from an implementation of {@link Subject}
	 * @param pressure the pressure you get from an implementation of {@link Subject}
	 */
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void update(){
	    this.temperature = (((WeatherData) weatherData)).getTemperature();
	    this.humidity = ((WeatherData) weatherData).getHumidity();
	    display();
    }

	/**
	 * Prints the current temperature and humidity to console
	 */
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
