package abstract_factory.pizza;

/**
 * Concrete implementation of {@link IngredientFactory}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class ChicagoStyleIngredientFactory extends IngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickDough();
	}

	@Override
	public Cheese createCheese() {
		return new Cheddar();
	}

	@Override
	public Veggies createVeggies() {
		return new Tomato();
	}
}
