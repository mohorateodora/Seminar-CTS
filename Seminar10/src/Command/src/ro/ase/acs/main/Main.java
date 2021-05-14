package Command.src.ro.ase.acs.main;

import Command.src.ro.ase.acs.command.BurgerOrder;
import Command.src.ro.ase.acs.command.Chef;
import Command.src.ro.ase.acs.command.FoodOrder;
import Command.src.ro.ase.acs.command.PizzaOrder;
import Command.src.ro.ase.acs.command.Waiter;

public class Main {

	public static void main(String[] args) {
		Chef chef = new Chef();
		Waiter waiter = new Waiter();
		
		FoodOrder order1 = new BurgerOrder(chef);
		waiter.addOrder(order1);
		
		FoodOrder order2 = new PizzaOrder(chef);
		waiter.addOrder(order2);
		
		FoodOrder order3 = new BurgerOrder(chef);
		waiter.addOrder(order3);
		
		waiter.sendOrdersToKitchen();
	}

}
