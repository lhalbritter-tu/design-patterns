package simple.pizza;

/**
 * API for PizzaSimple-implementations
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 *
 * Based on <a href='https://github.com/bryanluby/SimplePizzaFactory'>Head First Design Patterns chapter 4's source code</a>
 */
public abstract class PizzaSimple {

    /**
     * Prepares the pizza by setting the ingredients
     */
    public abstract void prepare();

    /**
     * Cuts the pizza into 8 pieces
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
