package main.java;

/**
 * Tests the different behaviours of the concrete implementations of {@link Animal} using the {@link Hauptklasse}
 *
 * @author Leo Halbritter
 * @version 2019-04-26
 */
public class TestClass {

    public static void main(String[] args){

        //Referenz auf ein Hauptklasse-Objekt erstellen
        Hauptklasse hauptklasse = new Hauptklasse();

        //Das Tier der Hauptklasse auf Hund setzen...
        hauptklasse.setAnimal(new Dog());
        //und ihn bellen lassen
        hauptklasse.makeSound();

        //Da sich makeSound in Hauptklasse nicht ändert, muss man also das Tier ändern, damit makeSound etwas anderes macht
        hauptklasse.setAnimal(new Cat());
        //bei einer Katze wird also "Meow!" ausgegeben
        hauptklasse.makeSound();

        hauptklasse.setAnimal(new Bird());
        hauptklasse.makeSound();
    }
}
