package simple.pizza;

/**
 * Simple factory for creating different implementations of {@link PizzaSimple}
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 *
 * Based on <a href='https://github.com/bryanluby/SimplePizzaFactory'>Head First Design Patterns chapter 4's source code</a>
 */
public class SimplePizzaFactory {

    //PizzaSimple field
    private PizzaSimple pizzaSimple;

    /**
     * Creates an implementation of {@link PizzaSimple} based on the type param and returns it
     * @param type to check which PizzaSimple should be created
     * @return implementation of {@link PizzaSimple}
     */
    public PizzaSimple createPizza(String type){
        if(type.equals("Greek")){
            this.pizzaSimple = new GreekPizzaSimple();
        }else if(type.equals("Cheese")){
            this.pizzaSimple = new CheesePizzaSimple();
        }else if(type.equals("Pepperoni")){
            this.pizzaSimple = new PepperoniPizzaSimple();
        }
        return this.pizzaSimple;
    }
}
