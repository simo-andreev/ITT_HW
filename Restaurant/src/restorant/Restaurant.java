package restorant;

import java.util.ArrayList;
import java.util.HashMap;

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
	
	public Waiter callForWaiter(AbstractClient cli){
		//TODO - get a random Waiter if client validly needs it.
		return null;
	}
	
	public void recivePayment(double sum){
		//TODO pay into funds. Might or might not warrant validation if sum == bill.
	}
	
}
