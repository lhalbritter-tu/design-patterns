package observer.weather;

/**
 * Interface for {@link Observer} implementations, that display elements gotten from {@link Subject} implementations
 */
public interface DisplayElement {

	/**
	 * Displays the fields of a concrete implementation of {@link Observer} after they were changed
	 */
	public void display();
}
