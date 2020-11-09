package main.java;

/**
 * Concrete implementation of {@link Animal} which displays the behaviour of a cat
 *
 * @author Leo Halbritter
 * @version 2019-04-26
 */
public class Cat implements Animal {

    /**
     * {@link Animal#makeSound()}
     */
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
