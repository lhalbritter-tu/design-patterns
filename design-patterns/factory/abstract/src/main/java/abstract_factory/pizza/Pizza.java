package abstract_factory.pizza;

/**
 * API for Pizza implementations
 */
public abstract class Pizza {

	/**
	 * IngredientFactory, which is set by an implementation of {@link PizzaStore}
	 */
	IngredientFactory ingredientFactory;

	/**
	 * Gets the ingredients for the Pizza and prints them
	 */
	public abstract void prepare();

	/**
	 * Cuts the pizza
	 */
	public abstract void cut();

	/**
	 * Bakes the pizza
	 */
	public abstract void bake();

	/**
	 * Boxes the pizza
	 */
	public abstract void box();

}
