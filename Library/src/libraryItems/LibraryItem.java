package libraryItems;

import com.main.Category;

public abstract class LibraryItem implements Comparable<LibraryItem> {

	private final String title;
	private final String publisher;
	private final String topic;

	public LibraryItem(String title, String publisher, String topic) {
		this.title = title;
		this.publisher = publisher;
		this.topic = topic;
	}

	abstract public Category getCategory();

	@Override
	public abstract int compareTo(LibraryItem o);

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getTopic() {
		return topic;
	}

	@Override
	abstract public String toString();
	
}
