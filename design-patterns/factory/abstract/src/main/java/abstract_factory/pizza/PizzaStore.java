package abstract_factory.pizza;

/**
 * API for PizzaStore implementations
 *
 * @author Leo Halbritter
 * @version 2019-04-28
 */
public abstract class PizzaStore {

	/**
	 * The field to specify which style of ingredients should be used, is set in the constructor of concrete implementations
	 */
	IngredientFactory ingredientFactory;

	/**
	 * The Pizza which is ordered at the moment
	 */
	Pizza pizza;

	/**
	 * Gets the correct {@link Pizza} implementation - based on type param - and executes all the methods of it,
	 * then returns it
	 *
	 * @param type the type to specify which {@link Pizza} implementation should be created
	 * @return the correct {@link Pizza} implementation
	 */
	public Pizza orderPizza(String type) {
		createPizza(type);
		this.pizza.prepare();
		this.pizza.bake();
		this.pizza.cut();
		this.pizza.box();
		return this.pizza;
	}

	/**
	 * Creates the correct {@link Pizza} implementation - based on type param - and returns it
	 *
	 * @param type the type to specify which {@link Pizza} implementation should be created
	 * @return the correct {@link Pizza} implementation
	 */
	public Pizza createPizza(String type){
		if(type.equals("Cheese")){
			this.pizza = new CheesePizza(this.ingredientFactory);
		}else if(type.equals("Pepperoni")){
			this.pizza = new PepperoniPizza(this.ingredientFactory);
		}else if(type.equals("Greek")){
			this.pizza = new GreekPizza(this.ingredientFactory);
		}
		return this.pizza;
	}

}
