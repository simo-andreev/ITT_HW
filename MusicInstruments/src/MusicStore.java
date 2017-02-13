import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class MusicStore {

	
	private double cash;
	
	private HashMap<String, ArrayList<String>> categories;	//Category -> TypeName
	private HashMap<String, Instrument> instruments; 	//TypeName -> TypeObject 
	private HashMap<Instrument, Integer> inventory;	//Type -> < InstrObj -> quantity in inventory>
	
	//addInstrument
	public void addInstrument(Instrument ins, int quantity){
		//TODO!
		//if isInInventory -> add quantity
		//else add Inventory listing
	}
	
	//removeInstrument
	private void removeInstrument(String type){
		//TODO
		//if type is present in Inv. -> remove entry
	}
	
	
	public void sellInstrument(String type, int quantity){
		//TODO!!
		//check if enough items in inventory
		//remove quantity from inv. && add type.price * quantity to this.cash
	}

	public void resupply(String type, int quantity){
		//TODO!!
		//if this.hasEnoughCash -> pay -> add Intrument to inv.
	}
	
	
	private void listInstruments(Collection<Instrument> instrList){
	
		for(Instrument ins : instrList){
			String type = ins.getType();
			double price = instruments.get(type).getPrice();
			int stock = inventory.get(instruments.get(type));
			System.out.println(": :  :  : " + type + "price: " + price + "stock: " + stock);
		}
		
	}
	
	public void listByCategory(){
		for(Entry<String,ArrayList<String>> category : categories.entrySet()){
			System.out.println("-------------------------------");
			System.out.println(category.getKey());
			
//			ArrayList<Instrument> 
//			
//			listInstruments(category.getValue());			
		}
		System.out.println("-------------------------------");
	}
	
	public void listByName(){
		LinkedList<Instrument> sortedInstruments = new LinkedList<>();
		sortedInstruments.addAll(instruments.values());
		
		sortedInstruments.sort(new InstrumentsComparatorByName());
		
		for(Instrument ins : sortedInstruments){
			System.out.println(": :  :  : " + ins.getType());
		}
	}
	//list by price
	//list available 
	
	
	
}
