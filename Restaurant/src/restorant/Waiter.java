package restorant;

import java.util.ArrayList;
import java.util.HashMap;

import clients.AbstractClient;
import menuItems.AbstractMenuItem;

public class Waiter {

	String name;
	double tips;
	
	HashMap<AbstractClient, ArrayList<AbstractMenuItem>> orders;
	
	public double bringBill(AbstractClient cli){
		//TODO - get tottal value of client's oprders.
		return 0;		
	}
	
}
