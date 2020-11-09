package method.pizza;

/**
 * Testing class for the factory method pizza store
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public class Customer {

    public static void main(String[] args){
        //Testing Chicago style Cheese type
        String type = "Cheese";
        ChicagoPizzaStore cps = new ChicagoPizzaStore();
        cps.orderPizza(type);

        //Testing NY style cheese type
        NYStylePizzaStore nps = new NYStylePizzaStore();
        nps.orderPizza(type);

        //Testing Chicago style Pepperoni type
        type = "Pepperoni";
        cps.orderPizza(type);

        //Testing NY style greek type
        type = "Greek";
        nps.orderPizza(type);
    }
}
