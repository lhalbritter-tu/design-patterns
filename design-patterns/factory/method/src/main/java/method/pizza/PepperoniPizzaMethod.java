package method.pizza;

/**
 * Concrete implementation of {@link PizzaMethod}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class PepperoniPizzaMethod extends PizzaMethod {
    @Override
    public void prepare() {
        System.out.println("Putting pepperoni on PizzaSimple...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pepperoni pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking the pepperoni pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing a fresh pepperoni pizza...");
    }
}
