package libraryItems;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import com.main.Category;
import com.main.LoanableBook;

public class Book extends LoanableBook{

	private final String author;
	private final LocalDate publishDate;

	public Book(String title, String publisher, String topic, LocalDate publishDate, String author) {
		super(title, publisher, topic);
		this.publishDate = publishDate;
		this.author = author;
	}

	@Override
	public Category getCategory() {
		return Category.BOOK;
	}

	@Override
	public int compareTo(LibraryItem o) {
		Book bk = (Book) o;
		return -1 * (this.publishDate.compareTo(bk.getPublishDate()));
	}

	private ChronoLocalDate getPublishDate() {
		return this.publishDate;
	}


	@Override
	public long getLoanTime() {
		return 30;
	}

	@Override
	public String toString() {
		return this.getTitle() + " ~ " + this.author;
	}

}
