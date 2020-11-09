package method.pizza;

/**
 * Concrete implementation of {@link PizzaStore}
 * Chicago Pizza Store only has cheese and pepperoni Pizzas
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public PizzaMethod createPizza(String type) {
        PizzaMethod pizzaMethod = null;
        if(type.equals("Cheese")){
            //If this wouldn't be just an example you would probably have own implementations for ChicagoStyleCheesePizza and NYStyleCheesePizza
            System.out.println("Creating fresh Chicago style cheese Pizza");
            pizzaMethod = new CheesePizzaMethod();
        }else if(type.equals("Pepperoni")){
            System.out.println("Creating fresh Chicago style pepperoni Pizza");
            pizzaMethod = new PepperoniPizzaMethod();
        }
        return pizzaMethod;
    }
}
