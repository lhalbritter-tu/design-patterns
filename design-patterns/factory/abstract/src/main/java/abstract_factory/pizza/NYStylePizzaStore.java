package abstract_factory.pizza;

/**
 * Concrete implementation of {@link PizzaStore}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class NYStylePizzaStore extends PizzaStore {

    /**
     * Sets the {@link PizzaStore#ingredientFactory} field to the {@link NYStyleIngredientFactory} implementation of {@link IngredientFactory}
     */
    public NYStylePizzaStore(){
        this.ingredientFactory = new NYStyleIngredientFactory();
    }

}
