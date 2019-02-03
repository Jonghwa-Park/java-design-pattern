package chap1_iterator;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
		// TODO Auto-generated constructor stub
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}
