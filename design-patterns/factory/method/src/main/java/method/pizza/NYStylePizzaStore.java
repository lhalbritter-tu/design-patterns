package method.pizza;

/**
 * Concrete implementation of {@link PizzaStore}
 * NYStylePizzaStore only has greek and cheese pizzas
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public PizzaMethod createPizza(String type) {
        PizzaMethod pizzaMethod = null;
        if(type.equals("Greek")){
            System.out.println("Creating fresh NYStyle greek Pizza");
            pizzaMethod = new GreekPizzaMethod();
        }else if(type.equals("Cheese")){
            System.out.println("Creating fresh NYStyle cheese Pizza");
            pizzaMethod = new CheesePizzaMethod();
        }
        return pizzaMethod;
    }
}
