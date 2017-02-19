package libraryItems;

import java.time.LocalDate;

import com.main.Category;

public class Magazine extends LibraryItem {

	@SuppressWarnings("unused")
	private final LocalDate publishDate;
	private final int issueNumber;

	public Magazine(String title, String publisher, String topic, int issueNumber, LocalDate publishDate) {
		super(title, publisher, topic);
		this.issueNumber = issueNumber;
		this.publishDate = publishDate;
	}

	@Override
	public Category getCategory() {
		return Category.MAGAZINE;
	}

	@Override
	public int compareTo(LibraryItem o) {
		Magazine mg = (Magazine) o;
		if (this.getTitle().equals(mg.getTitle()))
			return this.issueNumber - mg.getIssueNumber();

		return this.getTitle().compareTo(mg.getTitle());
	}

	private int getIssueNumber() {
		return this.issueNumber;
	}

	@Override
	public String toString() {
		return this.getTitle() + " : брой " + this.issueNumber;
	}

}
