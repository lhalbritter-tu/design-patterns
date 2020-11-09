package abstract_factory.pizza;

/**
 * Concrete implementation of {@link IngredientFactory}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class NYStyleIngredientFactory extends IngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinDough();
	}

	@Override
	public Cheese createCheese() {
		return new FetaCheese();
	}

	@Override
	public Veggies createVeggies() {
		return new Cucumber();
	}
}
