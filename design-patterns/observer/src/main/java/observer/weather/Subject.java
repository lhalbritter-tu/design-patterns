package observer.weather;

/**
 * API for the subject side of the observer pattern.
 * the subject side notifies all registered observers
 */
public interface Subject {

    /**
     * Registers a new observer, that wants to get the data from a concrete implementation of this class
     *
     * @param o instance of concrete implementation of {@link Observer}
     */
	public void registerObserver(Observer o);

    /**
     * Removes a registered observer
     *
     * @param o instance of concrete implemenation of {@link Observer}
     */
	public void removeObserver(Observer o);

    /**
     * Notifies all registered {@link Observer} implementations if some data changed
     */
	public void notifyObservers();
}
