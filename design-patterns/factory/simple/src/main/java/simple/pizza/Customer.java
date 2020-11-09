package simple.pizza;

/**
 * Testing class for the simple pizza store
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class Customer {

    public static void main(String[] args){
        //Testing Cheese type
        String type = "Cheese";

        //Create a new factory for the pizzastore
        SimplePizzaFactory factory = new SimplePizzaFactory();

        //Create a new Pizzastore
        PizzaStore pizzaStore = new PizzaStore(factory);

        //Ordering a cheese pizza
        pizzaStore.orderPizza(type);

        //Ordering a pepperoni pizza
        type = "Pepperoni";
        pizzaStore.orderPizza(type);

        //Ordering a greek pizza
        type = "Greek";
        pizzaStore.orderPizza(type);
    }
}
