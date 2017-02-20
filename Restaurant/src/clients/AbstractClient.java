package clients;

import java.util.ArrayList;
import java.util.Random;

import menuItems.AbstractMenuItem;
import restorant.Restaurant;
import restorant.Waiter;

public abstract class AbstractClient {

	private String name;
	private double money;

	private Restaurant restaurant;
	private Waiter waiter;

	protected AbstractClient(String name, double money) {
		if (name.isEmpty() || name == null)
			throw new IllegalArgumentException("Invalid String name parameter passed: " + name);
		if (money <= 0)
			throw new IllegalArgumentException("Invalid double money parameter passed: " + money);

		this.name = name;
		this.money = money;
	}

	public void enterRestaurant(Restaurant rst) {
		// TODO - if this.restr == null -> enter rst;
	}

	public abstract ArrayList<AbstractMenuItem> makeOrder();
	// TODO - if this.wgtr == null -> call for waiter. Order random, but
	// appropriate items

	public void payBill() {
		/*
		 * Да плати сметката – при плащане клиентът има 80% вероятност да остави
		 * бакшиш в размер на между 5% и 10% от стойността на поръчката му.
		 * Бакшишът остава директно за сервитьора, а останалата сума се прибавя
		 * към сметката на ресторанта.
		 * 
		 */
		double bill = requestBill();
		
		Random rand = new Random();
		
		//validate this has enough money (money >= bill*1.1 as to be able to tip) Just in case.
		
		this.restaurant.recivePayment(bill);
		this.money -= bill;
		
		if(rand.nextFloat() > .2){
			double tip = bill * ((rand.nextInt(5+1)+5)/100);
			this.waiter.reciveTip(tip);
			this.money -= tip;
		}
		
		
	}

	protected Restaurant getRestaurant(){
		return this.restaurant;
	}
	
	private double requestBill() {
		if (this.waiter == null)
			return 0;

		return this.waiter.bringBill(this);
	}

}
