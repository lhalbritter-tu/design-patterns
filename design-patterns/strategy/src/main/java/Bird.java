package main.java;

/**
 * Concrete implementation of {@link Animal} which shows the behaviour of a bird
 *
 * @author Leo Halbritter
 * @version 2019-04-26
 */
public class Bird implements Animal {

    /**
     * {@link Animal#makeSound()}
     */
    @Override
    public void makeSound() {
        System.out.println("Tweet tweet!");
    }
}
