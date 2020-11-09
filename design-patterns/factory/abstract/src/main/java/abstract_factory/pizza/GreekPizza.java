package abstract_factory.pizza;

/**
 * Concrete implementation of {@link Pizza}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class GreekPizza extends Pizza {

	public GreekPizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/**
	 * Cheese & dough depends on the given implementation of {@link IngredientFactory}
	 */
	@Override
	public void prepare() {
		Cheese cheese = this.ingredientFactory.createCheese();
		Dough dough = this.ingredientFactory.createDough();
		Veggies veggies = this.ingredientFactory.createVeggies();

		dough.printType();
		cheese.printType();
		veggies.printType();
	}

	@Override
	public void cut() {
		System.out.println("Cutting greek Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking greek Pizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing greek Pizza");
	}
}
