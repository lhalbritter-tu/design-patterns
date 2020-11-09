package abstract_factory.pizza;

/**
 * Concrete implementation of {@link Dough}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class ThickDough implements Dough {

    @Override
    public void printType() {
        System.out.println("Thick dough!");
    }
}
