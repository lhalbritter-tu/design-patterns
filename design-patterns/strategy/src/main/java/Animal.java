package main.java;

/**
 * API for different Animal-implementations
 *
 * @author Leo Halbritter
 * @version 2019-04-26
 */
public interface Animal{

    /**
     * The sound the concrete implementation of this class makes should be printed to the output
     */
    public void makeSound();
}