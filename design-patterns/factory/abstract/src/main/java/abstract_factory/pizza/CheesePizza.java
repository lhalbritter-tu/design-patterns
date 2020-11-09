package abstract_factory.pizza;

/**
 * Concrete implementation of {@link Pizza}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class CheesePizza extends Pizza {

	public CheesePizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/**
	 * Cheese & dough depends on the given implementation of {@link IngredientFactory}
	 */
	@Override
	public void prepare() {
		Cheese cheese = this.ingredientFactory.createCheese();
		Dough dough = this.ingredientFactory.createDough();

		dough.printType();
		cheese.printType();
	}

	@Override
	public void cut() {
		System.out.println("Cutting cheese Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking cheese Pizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing cheese Pizza");
	}
}
