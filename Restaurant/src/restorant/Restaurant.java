package restorant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import clients.AbstractClient;
import menuItems.AbstractMenuItem;
import menuItems.IType;
import menuItems.MenuItemCategory;

public class Restaurant {

	private String name;
	private double funds;

	private HashMap<MenuItemCategory, HashMap<IType, ArrayList<AbstractMenuItem>>> menu;
	private ArrayList<Waiter> staff;
	private HashMap<AbstractClient, Waiter> clients;

	public Restaurant(String string, double funds) {
		if (name.isEmpty() || name == null)
			throw new IllegalArgumentException("Invalid String name parameter passed: " + name);
		if (funds <= 0)
			throw new IllegalArgumentException("Invalid double funds parameter passed: " + funds);
		
		this.name = name;
		this.funds = funds;
		
		
		this.menu = new HashMap<>();
		this.menu.put(MenuItemCategory.DRINK, new HashMap<>());
		this.menu.put(MenuItemCategory.FOOD, new HashMap<>());
		
		
		for(int i = 0; i < 10; i++){
		}
		
	}
	
	
	private void addMenuItem(AbstractMenuItem itm){
		
		
		
	}
	

	public Waiter callForWaiter(AbstractClient cli) {
		Random rand = new Random();

		Waiter wtr = staff.get(rand.nextInt(staff.size()));
		this.clients.put(cli, wtr);
		return wtr;
	}

	public void recivePayment(double sum) {
		// TODO pay into funds. Might or might not warrant validation if sum ==
		// bill.
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFunds() {
		// TODO Auto-generated method stub
		return null;
	}

	public Waiter mostTippedWaiter() {
		// TODO Auto-generated method stub
		return null;
	}

	public void listWaitersByTip() {
		// TODO Auto-generated method stub
	}

	public void listInventory() {
		// TODO Auto-generated method stub
	}

}
