package main.java;

/**
 * Concrete implementation of {@link Animal} which displays the behaviour of a dog
 *
 * @author Leo Halbritter
 * @version 2019-04-26
 */
public class Dog implements Animal{

    @Override
    public void makeSound(){
        System.out.println("Bark bark!");
    }

}