package main;

import java.util.ArrayList;
import java.util.Random;

import clients.AbstractClient;
import clients.Student;
import clients.Thug;
import clients.Vegan;
import restorant.Restaurant;

public class Demo {

	private static void startWork(Restaurant rst) {

		ArrayList<AbstractClient> clients = generateClients();

		for (AbstractClient cli : clients) {
			cli.enterRestaurant(rst);
			cli.makeOrder();
			cli.payBill();
		}

	}

	private static ArrayList<AbstractClient> generateClients() {

		Random rand = new Random();

		ArrayList<AbstractClient> clients = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			float n = rand.nextFloat();

			if (n < .20) {
				clients.add(new Vegan("Should-Take-A-Rand-Name-From-A-List-Or-Something...."));
				continue;
			} else if (n < .50) {
				clients.add(new Student("If-There-Is-Time-I'll-Implement-Random-Names."));
				continue;
			} else {
				clients.add(new Thug("If-You-Are-Reading-This-I-Apparently-Didn't-Have-The-Time....."));
				continue;
			}
		}

		return clients;
	}

	public static void main(String[] args) {

		Restaurant rstrnt = new Restaurant("Pri Pesho", 1000);

		startWork(rstrnt);

		System.out.println(rstrnt.getName() + " current funds: " + rstrnt.getFunds());

		System.out.println(rstrnt.mostTippedWaiter().toString());

		rstrnt.listWaitersByTip();

		rstrnt.listInventory();

	}

}
