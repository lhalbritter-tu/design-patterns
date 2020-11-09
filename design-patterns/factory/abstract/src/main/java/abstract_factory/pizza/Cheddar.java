package abstract_factory.pizza;

/**
 * Concrete implementation of {@link Cheese}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class Cheddar implements Cheese {

    @Override
    public void printType() {
        System.out.println("Cheddar cheese!");
    }
}
