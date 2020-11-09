package method.pizza;

/**
 * API for PizzaStore-implementations in factory method pattern
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public abstract class PizzaStore {

    /**
     * executes the process of preparing an ordered pizza
     *
     * @param type the type of pizza to order
     * @return the implementation of {@link PizzaMethod}, based on type
     */
    public PizzaMethod orderPizza(String type){
        PizzaMethod pizzaMethod = this.createPizza(type);
        pizzaMethod.prepare();
        pizzaMethod.bake();
        pizzaMethod.cut();
        pizzaMethod.box();
        return pizzaMethod;
    }

    /**
     * Method to create the correct pizza acting as a factory for each implementation of {@link PizzaStore}
     *
     * @param type the type of pizza to order
     * @return the implementation of {@link PizzaMethod}, based on type
     */
    public abstract PizzaMethod createPizza(String type);
}
