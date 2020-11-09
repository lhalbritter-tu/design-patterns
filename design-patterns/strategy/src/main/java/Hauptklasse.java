package main.java;

/**
 * Class which contains all the parts of an animal, that don't change
 *
 * @author Leo Halbritter
 * @version 2019-04-26
 */
public class Hauptklasse {

    //field which stores the current animal
    private Animal animal;

    /**
     * Sets {@link Hauptklasse#animal} to a concrete implementation of {@link Animal}
     * Changes the output of {@link Hauptklasse#makeSound()}
     *
     * @param animal concrete implementation of {@link Animal}
     */
    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    /**
     * Executes the {@link Animal#makeSound()} behaviour of the currently set concrete implementation of {@link Animal}
     * in {@link Hauptklasse#animal}
     */
    public void makeSound(){
        this.animal.makeSound();
    }
}
