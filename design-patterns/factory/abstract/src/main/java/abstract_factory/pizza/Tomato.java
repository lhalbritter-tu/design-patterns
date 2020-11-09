package abstract_factory.pizza;

/**
 * Concrete implementation of {@link Veggies}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class Tomato implements Veggies {

    @Override
    public void printType() {
        System.out.println("Tomatoes!");
    }
}
