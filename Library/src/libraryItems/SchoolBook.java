package libraryItems;

import com.main.Category;
import com.main.LoanableBook;

public class SchoolBook extends LoanableBook {

	private final String author;

	public SchoolBook(String title, String publisher, String topic, String author) {
		super(title, publisher, topic);
		this.author = author;
	}

	@Override
	public Category getCategory() {
		return Category.SCHOOLBOOK;
	}

	@Override
	public int compareTo(LibraryItem o) {
		SchoolBook scb = (SchoolBook) o;
		return this.getTitle().compareTo(scb.getTitle());
	}


	@Override
	public long getLoanTime() {
		return 15;
	}

	@Override
	public String toString() {
		return this.getTitle() + " ~ " + this.author;
	}

}
