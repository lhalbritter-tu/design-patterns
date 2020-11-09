package observer.weather;

/**
 * The interface for all implementations of the Observer-Pattern's observer-side
 * the observer side gets notified by the subject-side and updates its data.
 */
public interface Observer {
	/**
	 * Will be called by a concrete implementation of {@link Subject} in {@link Subject#notifyObservers()}
	 * to send all values, if some or all of them changed. This is the update-method for the push pattern of Observer-Patterns.
	 *
	 * @param temp the temperature you get from a implementation of {@link Subject}
	 * @param humidity the humidity you get from a implementation of {@link Subject}
	 * @param pressure the pressure you get from a implementation of {@link Subject}
	 */
	public void update(float temp, float humidity, float pressure);

/**
 * Will be called by a concrete implementation of {@link Subject} in {@link Subject#notifyObservers()}
 * to get all values, if some or all of them changed. This is the update-method for the pull pattern of Observer-Patterns.
 * The pull pattern has the advantage, that the implementations can have independent fields and are not bound to the parameters.
 */
	public void update();
}
