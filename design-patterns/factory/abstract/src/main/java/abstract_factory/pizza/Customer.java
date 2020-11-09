package abstract_factory.pizza;

public class Customer {

    public static void main(String[] args){
        NYStylePizzaStore nps = new NYStylePizzaStore();
        ChicagoPizzaStore cps = new ChicagoPizzaStore();

        String type = "Cheese";

        //Testing NY style CheesePizza
        nps.orderPizza(type);

        //Testing Chicago style CheesePizza
        cps.orderPizza(type);

        type = "Pepperoni";

        //Testing NY style PepperoniPizza
        nps.orderPizza(type);

        //Testing Chicago style PepperoniPizza
        cps.orderPizza(type);

        type = "Greek";

        //Testing NY style GreekPizza
        nps.orderPizza(type);

        //Testing Chicago style GreekPizza
        cps.orderPizza(type);
    }

}
