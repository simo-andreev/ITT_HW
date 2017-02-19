package com.main;

import java.time.LocalDate;
import java.util.TreeMap;

import libraryItems.LibraryItem;

abstract public class LoanableBook extends LibraryItem {

	
	private TreeMap<LocalDate, LocalDate> loanHistory;

	
	public LoanableBook(String title, String publisher, String topic) {
		super(title, publisher, topic);
		this.loanHistory = new TreeMap<>();
	}

	public void loanBook(){
		
		LocalDate now = LocalDate.now();
		long loanTime = this.getLoanTime();
		
		this.loanHistory.put(now, now.plusDays(loanTime));
		
	}

	abstract public long getLoanTime();

}
