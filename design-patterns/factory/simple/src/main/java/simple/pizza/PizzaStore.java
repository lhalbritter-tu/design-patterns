package simple.pizza;

public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public PizzaSimple orderPizza(String type){
        PizzaSimple pizzaSimple = this.factory.createPizza(type);
        pizzaSimple.prepare();
        pizzaSimple.bake();
        pizzaSimple.cut();
        pizzaSimple.box();
        return pizzaSimple;
    }
}
