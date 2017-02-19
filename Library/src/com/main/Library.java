package com.main;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

import libraryItems.LibraryItem;

public class Library {

	private HashMap<Category, HashMap<String, TreeSet<LibraryItem>>> catalogue;

	public Library() {
		this.catalogue = new HashMap<>();
		this.catalogue.put(Category.BOOK, new HashMap<>());
		this.catalogue.put(Category.SCHOOLBOOK, new HashMap<>());
		this.catalogue.put(Category.MAGAZINE, new HashMap<>());
	}

	public void addItem(LibraryItem itm) {

		HashMap<String, TreeSet<LibraryItem>> category = catalogue.get(itm.getCategory());

		String topic = itm.getTopic();

		if (!category.containsKey(topic))
			category.put(topic, new TreeSet<>());

		category.get(topic).add(itm);

	}

	public void loanBook(LibraryItem lbi) {

		if (!(lbi instanceof LoanableBook)) {
			System.out.println("Sorry, but this item can not be loaned."
					+ " Feel free to read it in our reading-room or pick another item. Thank You!");
			return;
		}

		((LoanableBook) lbi).loanBook();
		this.catalogue.get(lbi.getCategory()).get(lbi.getTopic()).remove(lbi);

	}
	
	
	public void printCatalogue(){
		
		for(Entry<Category, HashMap<String, TreeSet<LibraryItem>>> ctgry : catalogue.entrySet()){
			
			System.out.println("======================================");
			System.out.println(ctgry.getKey().toString());
			
			for(Entry<String, TreeSet<LibraryItem>> topic : ctgry.getValue().entrySet()){
				
				System.out.println("----------------------------------");
				System.out.println(": : : " + topic.getKey());
				
				for(LibraryItem lbi : topic.getValue()){
					System.out.println(": : : - - - " + lbi.toString());
				}
				
			}
			
		}
		
	}

}
