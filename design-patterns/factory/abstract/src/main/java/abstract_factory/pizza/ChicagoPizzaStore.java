package abstract_factory.pizza;

/**
 * Concrete implementation of {@link PizzaStore}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class ChicagoPizzaStore extends PizzaStore {

    /**
     * Sets the {@link PizzaStore#ingredientFactory} field to the {@link ChicagoStyleIngredientFactory} implementation of {@link IngredientFactory}
     */
    public ChicagoPizzaStore(){
        this.ingredientFactory = new ChicagoStyleIngredientFactory();
    }

}
