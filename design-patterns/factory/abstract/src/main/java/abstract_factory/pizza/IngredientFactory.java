package abstract_factory.pizza;

/**
 * API for factory-implementations
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public abstract class IngredientFactory {

	/**
	 * Creates the {@link Dough} instance for this concrete implementation
	 *
	 * @return the correct instance of {@link Dough}
	 */
	public abstract Dough createDough();

	/**
	 * Creates the {@link Cheese} instance for this concrete implementation
	 *
	 * @return the correct instance of {@link Cheese}
	 */
	public abstract Cheese createCheese();

	/**
	 * Creates the {@link Veggies} instance for this concrete implementation
	 *
	 * @return the correct instance of {@link Veggies}
	 */
	public abstract Veggies createVeggies();

}
