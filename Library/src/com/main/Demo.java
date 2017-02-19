package com.main;

import java.time.LocalDate;
import java.util.HashSet;

import libraryItems.Book;
import libraryItems.LibraryItem;
import libraryItems.Magazine;
import libraryItems.SchoolBook;

public class Demo {

	public static void main(String[] args) {

		LibraryItem lnb = new Magazine("sasasa","sasasa","sasasasa",12,LocalDate.now());
		
		System.out.println(lnb instanceof LoanableBook);
		
		Library lbr = new Library();
		
		System.out.println("========================================");
		
		lbr.printCatalogue();
		
		SchoolBook schoolBook1 = new SchoolBook("Short guide to the KKK", "BlackBook inc", "Social Studies", "Jaquin Tamal");
		SchoolBook schoolBook2 = new SchoolBook("Aldehides & Vodka", "Bacchus pub.", "Chemestry", "Wi Kno");
		SchoolBook schoolBook3 = new SchoolBook("The SJW in You!", "Snoflake publishing", "Social Studies", "Tamara Womyn");
		SchoolBook schoolBook4 = new SchoolBook("Maths for the 3 w/o", "ParCorp inc", "Social Studies", "Buiy May");
		
		Book book1 = new Book("The 11 magic pebbles", "FantaZee", "fatasy", LocalDate.now(), "J.J.K.L. Johnsomson");
		Book book2 = new Book("The 12 magic pebbles", "FantaZee", "fatasy", LocalDate.now(), "J.J.K.L. Johnsomson");
		Book book3 = new Book("The 13 magic pebbles", "FantaZee", "fatasy", LocalDate.now(), "J.J.K.L. Johnsomson");
		Book book4 = new Book("The 12 magic pebbles", "FantaZee", "fatasy", LocalDate.now(), "J.J.K.L. Johnsomson");
		
		Magazine mgzn1 = new Magazine("Life-ish", "Trend", "General BullShit", 3, LocalDate.now());
		Magazine mgzn2 = new Magazine("Life-ish", "Trend", "General BullShit", 3, LocalDate.now());
		Magazine mgzn3 = new Magazine("Life-ish", "Trend", "General BullShit", 3, LocalDate.now());
		Magazine mgzn4 = new Magazine("Life-ish", "Trend", "General BullShit", 3, LocalDate.now());
		
		
		lbr.addItem(book1);
		lbr.addItem(book2);
		lbr.addItem(book3);
		lbr.addItem(book4);

		lbr.addItem(schoolBook1);
		lbr.addItem(schoolBook2);
		lbr.addItem(schoolBook3);
		lbr.addItem(schoolBook4);

		lbr.addItem(mgzn1);
		lbr.addItem(mgzn2);
		lbr.addItem(mgzn3);
		lbr.addItem(mgzn4);
		
		
		lbr.printCatalogue();

	}

}
