package clients;

import java.util.ArrayList;

import menuItems.AbstractMenuItem;
import restorant.Restaurant;
import restorant.Waiter;

public abstract class AbstractClient {

	private String name;
	private double money;
	
	private Restaurant restaurant;
	private Waiter waiter;
	
	
	protected AbstractClient(String name, double money) {
		if(name.isEmpty() || name == null)
			throw new IllegalArgumentException("Invalid String name parameter passed: " + name);
		if(money <= 0)
			throw new IllegalArgumentException("Invalid double money parameter passed: " + money);
		
		this.name = name;
		this.money = money;
	}
	
	
	abstract ArrayList<AbstractMenuItem> makeOrder();
	
	void payBill(){
		//TODO - pay double Bill into Restaurant and a rand tip to waiter;
	}
	
	double requestBill(){
		//TODO - get bill from waiter;		
		return 0;
	}
	
	
	
	
	
}
